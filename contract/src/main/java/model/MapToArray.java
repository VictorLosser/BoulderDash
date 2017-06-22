package model;


import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class MapToArray {

	
	 private final String filename;
	    
	    //Simple constcructor. Taking the name of your map as argument ( in String) for example: MapToArray("level1.txt")
	    public MapToArray(String filename) {
	        this.filename = filename;
	    }

	    //This function will return the 2d array of the map, in INT[][]
	    public int[][] getArray() throws IOException {
	        ArrayList<String> array = new ArrayList<String>();

	        int length = getLength();
	        int height = getHeigth();
	        
	        LineNumberReader reader = new LineNumberReader(new FileReader(filename));
	        for (int i = 0; i < height; i++) {
	            array.add(reader.readLine());
	        }

	        if (array.size() == 0) {
	            System.out.println("Empty map");
	        }
	        int[][] numbers = new int[length][height];

	        int r = 0;
	        //Now that we have decided the size of our 2d array, we will fill it in
	        for (String s : array) {
	            toArray(s, r, numbers);
	            r++;
	        }

	        return numbers;
	    }

	    
	    //Since an array is static, we must find its boundaries. This function will return the amount of characters in the map. 
	    private int getLength() throws IOException {
	        int countChar = 0;
	        try {
	            LineNumberReader reader = new LineNumberReader(new FileReader(filename));
	            String lineRead = reader.readLine();
	            int length = 0;
	            while (countChar < lineRead.length()) {
	                if (!(lineRead.charAt(countChar) == ',')) {
	                    length++;
	                }
	                countChar++;
	            }
	            reader.close();
	            return length;
	        } catch (IOException e) {
	            throw e;
	        }
	    }

	    //This will return the height of the map (the amount of lines)
	    private int getHeigth() throws IOException {
	        try {
	            LineNumberReader reader = new LineNumberReader(new FileReader(filename));
	            @SuppressWarnings("unused")
	         String lineRead;
	            while ((lineRead = reader.readLine()) != null) {
	            }
	            int height = reader.getLineNumber();
	            reader.close();
	            return height;
	        } catch (IOException e) {
	            throw e;
	        }
	    }

	    //This function will fill an entire row with the numbers from String s.
	    private void toArray(String s, int row, int[][] numbers) {
	        String match = ",";
	        String[] veld = s.split(match);
	        
	        for(int i = 0; i<veld.length;i++)
	           veld[i] = veld[i].replaceAll(" ","");
	        
	        for (int i = 0; i < veld.length; i++) {
	            try {
	                numbers[i][row] = Integer.parseInt(veld[i]);
	            } catch (NumberFormatException e) {
	                System.out.println("Not a valid map!");
	            }
	        }
	    }
	}
