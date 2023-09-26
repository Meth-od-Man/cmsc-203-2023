/*
 * Class: CMSC203 
 * Instructor:Professor Monshi
 * Description: do something 
 * Due: 7/20/2019
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jared Hernandez
*/



public class PatientDriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Patient info:");
		
		//Patient info = new Patient("Jenny", "Elaine","Santori");
		Patient info = new Patient("Jenny","Elaine","Santori","123 Main street","MyTown","CA","Bill Santori","111-222-3333" ,"777-555-1212" , 01234);
		Procedure a = new Procedure("Physical Exam", "7/20/2019", "Dr.Irvine",3250.0);
		Procedure b = new Procedure("X-Ray","7/20/2019","Dr.Jamison",5500.43);
		Procedure c = new Procedure("Blood Test","7/20/2019","Dr.Smith",1400.75);
		

		displayPatient(info);
		displayProcedure(a,b,c);
		System.out.println("\nTotal Charges: $"+calculateTotalCharges(a,b,c));		
	



		System.out.println("\n\n\n\nStudent Name : Jared Hernandez\nMC#: M21123125\nDue Date: 06/12/2023");

}
	


public static void displayPatient(Patient info){
//String fName, String mName, String lName, String address, String city, String state, String emergencyContact, int phoneNum, 
//int emergencyNum, int zipcode
	System.out.println(info);
}
	
public static void displayProcedure(Procedure a,Procedure b,Procedure c) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
	
public static double calculateTotalCharges(Procedure a, Procedure b, Procedure c) {
	double total = a.getCharges() + b.getCharges() + c.getCharges();
	return total;
} 
	
	

}
