package game_ui;

public class Score {

	//Variables
	private final int total_number_diamond = 10;
	private int number_diamond;
	
	//Constructor
	public Score(){
		this.number_diamond = 0;
	}

	/*/GETTERS AND SETTERS/*/
	public int getTotal_number_diamond() {
		return total_number_diamond;
	}
	public int getNumber_diamond() {
		return number_diamond;
	}
	
	public void setNumber_diamond(int number_diamond) {
		this.number_diamond = number_diamond;
	}	
}
