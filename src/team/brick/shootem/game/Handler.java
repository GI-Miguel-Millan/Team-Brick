package team.brick.shootem.game;

import team.brick.shootem.game.input.KeyManager;
import team.brick.shootem.game.worlds.World;

/**
 *	The Handler manages the other classes in the game.
 * 	
 *	@author 
 *	@version 1.0
 *	@since version 1.0
 */
public class Handler {
	
	private Game game;
	private World world;
	
	public Handler(Game game){
		this.game = game;
	}
	
	/**
	 * @return the KeyManager stored in game.
	 */
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	
	/**
	 * @return the width of the game.
	 */
	public int getWidth(){
		return game.getWidth();
	}
	
	/**
	 * @return the height of the game.
	 */
	public int getHeight(){
		return game.getHeight();
	}

	/**
	 * @return the game 
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * @param game 
	 */
	public void setGame(Game game) {
		this.game = game;
	}

	/**
	 * @return the current world
	 */
	public World getWorld() {
		return world;
	}

	/**
	 * @param world the new world 
	 */
	public void setWorld(World world) {
		this.world = world;
	}
}
