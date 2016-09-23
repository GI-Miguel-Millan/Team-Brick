package team.brick.shootem.entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import team.brick.shootem.game.Handler;

/**
 *	The parent of all entities, or actors, in the game.
 *	It defines the entities dimensions, boundaries, and position
 *	on the screen. 
 * 	
 *	@author Miguel Millan
 *	@version 1.0
 *	@since version 1.0
 */
public abstract class Entity {

	protected Handler handler;
	protected float x, y;
	protected int width, height;
	protected Rectangle bounds;
	
	public Entity(Handler handler, float x, float y, int width, int height){
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		bounds = new Rectangle(0, 0, width, height);
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	//Incomplete at the moment
	public boolean checkEntityCollisions(float xOffset, float yOffset){
		
		return false; //default for now
	}
	
	public Rectangle getCollisionBounds(float xOffset, float yOffset){
		return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
