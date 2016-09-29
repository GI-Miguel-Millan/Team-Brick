package team.brick.shootem.game.entities;

import java.awt.Graphics;

import team.brick.shootem.game.Handler;

/**
 *	A Projectile is a moving Entity which deals damage to creatures. 
 * 
 *	@author Miguel Millan
 *	@version 1.0
 *	@since version 1.0
 */
public class Projectile extends Entity{

	public static final float DEFAULT_SPEED = 6.0f;
	public static final int DEFAULT_PROJECTILE_WIDTH = 10,
							DEFAULT_PROJECTILE_HEIGHT = 20;
	
	protected float speed;
	protected float xMove, yMove;
	
	public Projectile(Handler handler, float x, float y) {
		super(handler, x, y, DEFAULT_PROJECTILE_WIDTH, DEFAULT_PROJECTILE_HEIGHT);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
