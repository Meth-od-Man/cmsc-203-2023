import java.io.FileNotFoundException;
import java.util.*;
/*
 * Class: CMSC203 
 * Instructor: Peofessor Monshi
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jared Hernandez
*/





public class HolidayBonus extends Object{
	//step 1 count how many eements are in the file
	//step 2: create the array and copy the elements in 
	private static final int highestBonus = 5000;
	private static final int lowestBonus = 1000;
	private static final int OtherBonus = 2000;
	//TwoDimRaggedArrayUtility
	
	
	
	public static double[] calculateHolidayBonus(double[][] data) {		
		
		double[] results = new double[data.length];
	
		int accumulate =0;
		int counter = 0;
		
		
	
		
		
		for(int index =0; index < results.length; index ++) {	
			accumulate = 0;
		
			
			for(int i =0; i < data[index].length; i ++) {
				counter =0;
				if(data[index][i] != 0 && data[index][i]>0) {
					if(data[index][i] == TwoDimRaggedArrayUtility.getHighestInColumn(data, i)) {
			
						accumulate += 5000;
						counter ++;
					}
					
					else if(data[index][i] == TwoDimRaggedArrayUtility.getLowestInColumn(data,i)) {
				
						accumulate += 1000;
						counter ++;
					}
					
					else if(counter ==0) { 
						accumulate += 2000; 
					}
			
			
				}
			}
			
		
			results[index] = accumulate;
			System.out.println(results[index]);
		}
	

	
		return results;
	}
	
	
	
	public static double calculateTotalHolidayBonus(double[][] data) {
		double[] Data = calculateHolidayBonus(data);
		double total = 0.0;
		
		for(int i = 0; i < Data.length;  i ++) {
			total += Data[i];
		}
		
		return total;
		
		
	}
	
	
	
	
	
	
}
