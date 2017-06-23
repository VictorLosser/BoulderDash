package game_ui;

public class Score {

	//variables
	
	private final int total_number_diamond = 10;
	private int number_diamond;
	
	//constructor
	
	public Score(){
		this.setNumber_diamond(0);
	}

	//getters
	
	public int getTotal_number_diamond() {
		return total_number_diamond;
	}
	public int getNumber_diamond() {
		return number_diamond;
	}

	//setters
	
	public void setNumber_diamond(int number_diamond) {
		this.number_diamond = number_diamond;
	}
	
	
}
