package team.brick.shootem.game.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;

import team.brick.shootem.game.Handler;

/**
 *	Player is a Creature controlled by the user. This class takes input from the user
 *	for movement, and is able to shoot projectiles.
 * 	
 *	@author 
 *	@version 1.0
 *	@since version 1.0
 */
public class Player extends Creature {
	
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		
	}

	@Override
	public void tick() {
		//Movement
		getInput();
		move();
	}
	
	/**
	 *  Gets input from the user and sets the players yMove and
	 *  xMove according to which key is pressed.
	 */
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		
		//temporarily draw red box
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, width, height);
	}
	
	

}
