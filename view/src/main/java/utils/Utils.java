package utils;

public class Utils {

	//Parses the integers for the map 
	
	public static int parseInt(String number){
		try{
			return Integer.parseInt(number);
		} catch (NumberFormatException e){
			e.printStackTrace();
			return 0;
		}
	}
	
}
