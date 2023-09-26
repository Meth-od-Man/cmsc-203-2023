
public class Procedure {
	
	private String procedure;
	private String date;
	private String practitioner;
	private double charges;
	
	public Procedure() {
	
} 
	public Procedure(String procedure, String date) {
		this.procedure = procedure;
		this.date = date;
}
	public Procedure (String procedure, String date, String practitioner, double charges) {
		this.procedure = procedure;
		this.date = date;
		this.practitioner = practitioner;
		this.charges = charges;
}

	
	
	public void setProcedure(String procedure) {
		this.procedure = procedure;

}
	public void setDate(String date) {
		this.date = date;
}
	public void setPractitioner(String practitioner) {
		this.practitioner = practitioner;
}
	public void setCharges(double charges) {
		this.charges = charges;
}
	


	public String getProcedure() {
		return procedure;
}
	public String getDate() {
		return date;
}
	public String getPractitioner() {
		return practitioner;
}
	public double getCharges() {
		return charges;
}

	public String toString() {
		String output = "\n\n\tProcedure: " + procedure +
						"\n\tProcedure Date: " + date +
						"\n\tPractitioner: " + practitioner+
						"\n\tcharges: " + charges;
		
		return output;
	}









}
