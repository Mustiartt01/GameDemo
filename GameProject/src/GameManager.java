public class GameManager implements GameService{
	

	
	public void add(Game game) {
		
		System.out.println(game.getGameName() +  " adl� oyun eklendi...");

	}
	public void update(Game game) {
		
		System.out.println(game.getGameName() +  " adl� oyun g�ncellendi...");

	}
	public void delete(Game game) {
	
	System.out.println(game.getGameName() +  " adl� oyun silindi...");

	}
	
}
