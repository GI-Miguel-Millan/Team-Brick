package team.brick.shootem.game.entities.creatures;

import java.awt.Graphics;

import team.brick.shootem.game.Handler;

/**
 *	Enemies are creatures controlled by the system and not the user. There are 
 *	different types of Enemies, denoted by an integer.
 * 	
 *	@author Miguel Millan
 *	@version 1.0
 *	@since version 1.0
 */
public abstract class Enemy extends Creature{
	
	protected int type;
	
	public Enemy(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		type = 0; 
		
	}

	@Override
	public void tick() {
		
		//Movement
		move();
	}
	

	@Override
	public void render(Graphics g) {
		
	}
	
}
