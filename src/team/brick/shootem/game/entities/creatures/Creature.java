package team.brick.shootem.game.entities.creatures;

import team.brick.shootem.game.Handler;
import team.brick.shootem.game.entities.Entity;

/**
 *	Creatures are entities which move and have health.
 * 	
 *	@author Miguel Millan
 *	@version 1.0
 *	@since version 1.0
 */
public abstract class Creature extends Entity {
	
	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 64,
							DEFAULT_CREATURE_HEIGHT = 64;
	
	protected int health;
	protected float speed;
	protected float xMove, yMove;

	public Creature(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}
	
	/**
	 *	Calls the Creatures Move methods.
	 */
	public void move(){
			moveX();
			moveY();
	}
	
	/**
	 * Moves the Creature in the x direction.
	 */
	public void moveX(){
				x += xMove;
	}
	
	/**
	 * Moves the Creature in the y direction.
	 */
	public void moveY(){
				y += yMove;
	}
	
	//GETTERS SETTERS

	/**
	 * @return xMove 
	 */
	public float getxMove() {
		return xMove;
	}

	/**
	 * @param xMove how far the creature will move in the x-direction
	 */
	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	/**
	 * @return yMove
	 */
	public float getyMove() {
		return yMove;
	}

	/**
	 * @param yMove how far the Creature will move in the y-direction
	 */
	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	/**
	 * @return health the current health of the Creature
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the new health of the Creature
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return speed the current speed of the Creature
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * @param speed the new speed of the Creature
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
}
