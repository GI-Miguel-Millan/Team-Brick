package team.brick.shootem.game;

/**
 *	The Handler manages the other classes in the game.
 * 	
 *	@author 
 *	@version 1.0
 *	@since version 1.0
 */
public class Handler {
	
	private Game game;
	
	public Handler(Game game){
		this.game = game;
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}


}
