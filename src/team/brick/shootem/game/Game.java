package team.brick.shootem.game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import team.brick.shootem.game.display.*;
import team.brick.shootem.game.gfx.Assets;
import team.brick.shootem.game.input.KeyManager;
import team.brick.shootem.game.states.GameState;
import team.brick.shootem.game.states.State;

/**
 *	The Game class runs the game. It initializes the
 *	display and renders the game. It also contains the main
 * 	game loop.
 * 	
 *	@author 
 *	@version 1.0
 *	@since version 1.0
 */
public class Game implements Runnable {

	private Display display;
	private int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	public State gameState;
	
	//Input
	private KeyManager keyManager;
	
	
	//Handler
	private Handler handler;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	/**
	 *  Initializes everything.
	 */
	private void init(){
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		handler = new Handler(this);
		
		gameState = new GameState(handler);
		State.setState(gameState);
	}
	
	/**
	 *  Updates the game every tick.
	 */
	private void tick(){
		keyManager.tick();
		
		if(State.getState() != null)
			State.getState().tick();
	}
	
	/**
	 *  Renders all the graphics in the game to the screen.
	 */
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Draw Here!
		
		if(State.getState() != null)
			State.getState().render(g);
		
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	/**
	 *  The main game loop which ticks and renders every loop 
	 *  as long as the game is running.
	 */
	public void run(){
		
		init();
		
		
		int fps = 60;  // How many times every second we want to run tick() and render()
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				render();
				ticks++;
				delta--;
			}
			
			// Temporary FPS counter
			if(timer >= 1000000000){
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
		
	}
	
	/**
	 * @return keyManager
	 */
	public KeyManager getKeyManager(){
		return keyManager;
	}
	
	/**
	 * @return width of the game
	 */
	public int getWidth(){
		return width;
	}
	
	/**
	 * @return height of the game
	 */
	public int getHeight(){
		return height;
	}
	
	/**
	 *  Starts the thread which runs the game,
	 *  if it is not already running
	 */
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	/**
	 *  Joins the game thread, stopping the game,
	 *  if it is already running.
	 */
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}











