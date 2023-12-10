
public abstract class Beverage {
//•	Instance variables for beverage name, beverage type, size, and constant attributes for the base price ($2.0) and size price (additional $1 to go a size up).
	String bevName;
	Type type;
	Size size;
	private double basePrice = 2.0;
	private final double addSizePrice = 1.0;
	
	public Beverage(String bevName, Type type, Size size) {
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	
		
	}
	
	
	public double getBasePrice() {
		return basePrice;
	}
	public Type getType() {
		Type type2 = type;
		
		return type2;
	}
	public String getBevName() {
		return bevName;
	}
	public Size getSize() {
		Size size2 = size;
		
		return size2;
	}
	public double addSizePrice() {
		double price = basePrice;
		if(this.size == Size.MEDIUM) {
			price += addSizePrice;
		}
		else if(this.size == Size.LARGE) {
			price += (addSizePrice*2);
		}
		return price;
			
	}
	@Override
	public String toString() {
		String stuff = bevName + "," + size;
		return stuff;
	}
	@Override
	public boolean equals(Object anotherBev) {
		Beverage temp = (Beverage) anotherBev;
		if(this.bevName.equals(temp.bevName) && this.size.equals(temp.size)&& this.type.equals(temp.type)) {
			return true;
		}
		else return false;
	}
	
	
	public abstract double calcPrice();
	
	
	
	
}
