
public class Coffee extends Beverage{
	private boolean extraShot;
	private boolean extraSyrup;
	
	
	
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName,Type.COFFEE,  size);
		this.extraSyrup = extraSyrup;
		this.extraShot = extraShot;
	}
	public boolean getExtraShot() {
		return extraShot;
	}
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	@Override
	public double calcPrice() {
		double coffeePrice = super.addSizePrice();
		System.out.println("        " + coffeePrice);
		if(extraShot == true) {
			coffeePrice += .50;
			
		}
		if(extraSyrup == true) {
			coffeePrice +=.50;
			
		}
		System.out.println("        "+coffeePrice);
		return coffeePrice;
	}
	@Override
	public String toString() {
		
		String syrup = "No Extra syrup";
		String shot = "No Extra shot";
		if(extraSyrup == true) {
			syrup = "Extra syrup";
		}
		if(extraShot == true) {
			shot = "Extra shot";
		}
		return super.toString()+ ", " + shot + ", " + syrup + ", price: $" + calcPrice();
		
		}
	@Override
	public boolean equals(Object anotherBev) {
		Coffee temp = (Coffee) anotherBev;
		if(super.equals(anotherBev) && temp.extraShot == this.extraShot && temp.extraSyrup == this.extraSyrup) {
			return true;
		}
		else return false;
		
	}
	
	
	
}
