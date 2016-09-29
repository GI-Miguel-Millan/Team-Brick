package team.brick.shootem.game.entities.creatures;

import java.awt.Graphics;

import team.brick.shootem.game.Handler;

/**
 *	Player is a Creature controlled by the user. This class takes input from the user
 *	for movement, and is able to shoot projectiles.
 * 	
 *	@author Miguel Millan
 *	@version 1.0
 *	@since version 1.0
 */
public class Player extends Creature {
	
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 22;
		bounds.y = 44;
		bounds.width = 19;
		bounds.height = 19;
		
	}

	@Override
	public void tick() {
		
		//Movement
		getInput();
		move();
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		//Need to define a player input
		
	}

	@Override
	public void render(Graphics g) {
		
	}
	
	

}
