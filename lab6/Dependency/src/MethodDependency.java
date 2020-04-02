class Dice{
	public int Roll() {
		return 6;
	}
}


class Player{
	private String player_name;
	
	Player(String player_name){
		this.player_name = player_name;
	}
	
	public String get_Player_Name() {
		return player_name;
	}
//There is a dependency between the Player class and Roll method of Die class.
	public int moveTurn(Dice die1) {
		int result = die1.Roll();
		
		return result;
	}

}

public class MethodDependency {

	public static void main(String[] args) {
		Dice die = new Dice();
		Player player1 = new Player("Test Name");
		System.out.println(player1.moveTurn(die));
	}

}
