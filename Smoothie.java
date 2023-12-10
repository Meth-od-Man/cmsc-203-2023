
public class Smoothie extends Beverage{
	private int numOfFruits;
	private boolean addProtein;
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, Type.SMOOTHIE, size);
		// TODO Auto-generated constructor stub
	this.numOfFruits = numOfFruits;
	this.addProtein = addProtein;
	
	}
	public int getNumOfFruits() {
		return numOfFruits;
	}
	public boolean getAddProtein() {
		return addProtein;
	}
	
	@Override
	public String toString() {
		String protein = "Add Protein";
		if(addProtein == false) {
			protein = "no protein";
			
		}
		return super.toString() + ", " + protein + ", " + numOfFruits + " of fruits, price: $"+ calcPrice() ;
	}
	
	@Override
	public double calcPrice() {
		double price = super.addSizePrice();
		
			price += (numOfFruits * 0.50);
		
		if(addProtein == true) {
			price += 1.5;
		}

		
		return price;
	}
@Override
public boolean equals(Object anotherBev) {
	Smoothie temp = (Smoothie) anotherBev;
	if(super.equals(anotherBev) == true && this.numOfFruits == temp.numOfFruits && this.addProtein == temp.addProtein) {
		return true;
	}
	
	else return false;
	
}
	
	
	
	
	
	
	
}
