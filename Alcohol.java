
public class Alcohol extends Beverage{
boolean isWeekend;

public Alcohol(String bevName, Size size, boolean isWeekend) {
	super(bevName, Type.ALCOHOL, size);
	this.isWeekend = isWeekend;
}
public boolean isWeekend() {
	return isWeekend;
}

	

@Override
public double calcPrice() {
	
	double price = super.addSizePrice();
	if(isWeekend == true) {
		price += .60;
	}
	
	
	
	return price;
}

public String toString() {//whether or not beverage is offered in weekend and the price
	String weekend = "Available in weekend";
	if(isWeekend == false) {
		weekend = "Not available in weekend";
	}
	return super.toString() + ", " + weekend + ", Price: $" + calcPrice();
}

public boolean equals(Object anotherBev) {
	Alcohol temp = (Alcohol) anotherBev;
	if(super.equals(anotherBev) == true && this.isWeekend == temp.isWeekend) {
		return true;
	}
	return false;
	
}







}