/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jared Hernandez
*  */

// Import the File class
// Import this class to handle errors
import java.io.*; // Needed for the File class
// Needed for the Scanner class
import java.util.*;
/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here:Jared Hernandez
*/




public final class TwoDimRaggedArrayUtility extends Object{
//cannot be extended 

	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for(int r = 0; r < data.length; r ++) {
			for(int c = 0; c < data[r].length; c ++) {
				if(data[r][c]< lowest) {
					lowest = data[r][c];
				}
			}
		}
		
		return lowest;
		
	}
	
	
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		for(int r = 0; r < data.length; r ++) {
			for(int c = 0; c < data[r].length; c ++) {
				if(data[r][c]>highest) {
					highest = data[r][c];	
				}
			}
		}
		return highest;
		
	}
	
	
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowest = getHighestInColumn(data, col);
		int index = 0;
		for(int r = 0; r < data.length; r ++) {
			if(data[r].length > col) {
				if(data[r][col] != 0.0) {
					if(data[r][col] < lowest) {
						index = r;
					}
				}
			}
		}
		return index;
	}
	
	
public static double getLowestInColumn(double[][] data, int col) {
	double lowest = getHighestInColumn(data, col);
	
	
	for(int r = 0; r < data.length; r ++ ) {
		if(data[r].length > col) {
			if(data[r][col] != 0.0) {
				if(data[r][col] < lowest) {
					lowest=  data[r][col];
				}
			}
		}
	}
	return lowest;
	
		
	}
	
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
	
		double highest = 0.0;
		int index = 0;
		for(int r = 0; r < data.length; r ++) {
			if(data[r].length > col) {
				if(data[r][col] > highest) {
					highest=  data[r][col];
					index = r;
				}
			}
		}
		return index;
	}
	
	
	public static double getHighestInColumn(double[][] data, int col) {
double highest = data[0][col];
		
		
		for(int r = 0; r < data.length; r ++ ) {
			
			if(data[r].length > col) {
				
					if(data[r][col] > highest) {
				 highest =  data[r][col];	
				}
			}
			else ;
		}
		return highest;
	}



	public static int getLowestInRowIndex(double[][] data, int row) {
		
		double lowest = data[row][0];
		int index = 0;
		
		for(int c = 0;c < data[row].length; c ++ ) {
			if(data[row][c] < lowest) {
				lowest = data[row][c];
				index = c;
			}
		}
		return index;
		
	}

	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];
		
		for(int c = 0;c < data[row].length; c ++ ) {
			if(data[row][c] < lowest) {
				lowest = data[row][c];
			}
		}
		
		return lowest;
	}

	public static int getHighestInRowIndex(double[][] data, int row) {
		int index = 0;
		double highest = data[row][0];
		for(int c = 0;c < data[row].length; c ++ ) {
			if(data[row][c] > highest) {

				index = c;
			}
		}
		return index;
	}


	public static double getHighestInRow(double[][] data, int row) {
		double highest = 0.0;
		for(int c = 0;c < data[row].length; c ++ ) {
			if(data[row][c] > highest) {
				highest = data[row][c];
			}
		}
		return highest;
	}


public static double getColumnTotal(double[][] data, int col) {
	double total = 0.0;
	
	for(int r = 0; r < data.length; r ++) {
		total += data[r][col];
	}
	return total;
	
}


public static double getRowTotal(double[][] data, int row) {
	double total = 0.0;
	

		for(int c = 0; c < data[row].length; c ++) {
			total += data[row][c];
		}
	
	return total;
}



public static double getAverage(double[][] data) {
	double elements = 0.0;
	for(int row = 0; row < data.length; row++) {
		for(int col = 0; col < data[row].length; col++) {
			elements += 1.0;
		}
	}
	return getTotal(data)/elements;
	
}


public static double getTotal(double[][] data) {
	double sum = 0.0;
	
	
	for(int row = 0; row < data.length; row++) {
		for(int col = 0; col < data[row].length; col++) {
			
			sum += data[row][col];
			
		}
	}
	return sum;
}


public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{
	try {
		FileWriter writer = new FileWriter(outputFile);
		String thing = "l";
		
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				thing = String.valueOf(data[row][col]);
				if(thing != "0.0") {
				if(col == data[row].length-1) {
					
					writer.append(thing);
				}
				else writer.append(thing + " ");
				}
				else writer.append("");
				
			}
			
			writer.append("\n");
		}
		writer.close();
		
		
		
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


	public static double[][] readFile(File file) throws FileNotFoundException{
		//step 1 count how many elements are in the file
		//step 2: create the array and copy the elements in 
		try {
			Scanner s1 = new Scanner(file);
			String thing = "";
			int space;
			int maxSpace = 0;
			
			ArrayList<String> Row = new ArrayList<String>();
			
			while(s1.hasNextLine()) {
			
				thing = s1.nextLine();
				space  = 0;
				for(int i = 0; i < thing.length(); i ++) {
					if(thing.charAt(i) == ' ') {
						space ++;
					}
					if(space > maxSpace) {
						maxSpace = space;
					}
				}
			
			
				Row.add(thing);
			}
			

			// add characters to variable, if hasNext() == " ", stop adding characters  
			double[][] words = new double[Row.size()][maxSpace+1];
			ArrayList <Double> index = new ArrayList<Double>();
			space = 0;
			String thing2 = "";
			
			
			
			Scanner s2 = new Scanner(file);
			for(int r = 0; r < Row.size(); r ++) {
				thing = Row.get(r);
				
				
				for(int i =0; i < thing.length();i ++) {
					thing2 += String.valueOf(thing.charAt(i));
					if(thing.charAt(i) == ' ') {
						
						
						index.add(Double.parseDouble(thing2));
						thing2 = "";
					}
					
				
				}	
				if(thing2 != "") {
					index.add(Double.parseDouble(thing2));
					thing2 = "";
				}
			}
			
			
			int x =0;
			for(int r =0; r < Row.size(); r++) {
				thing = Row.get(r);
				for(int i =0; i < thing.length();i ++) {
					thing2 += String.valueOf(thing.charAt(i));
					if(thing.charAt(i) == ' ') {
						space++; 
					}
				}
				for(int c = 0; c < space+1; c++) {
				
					if(c<space+1) {
						index.get(x);
						words[r][c] = index.get(x);
				
				
					}
				
				
					x++;
				}
			
				space =0;
			}
			
			s1.close();
			s2.close();
			return words;
		}catch(FileNotFoundException e) {
			return null;	
		}
}
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

