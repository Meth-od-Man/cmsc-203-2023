import java.util.ArrayList;
import java.util.Random;

public class Order extends Object implements OrderInterface, Comparable<Order>{
	//	Instance variables for order number, order time, order day and customer and a list of beverages within this order
	int orderTime;
	int orderNumber;
	Day orderDay;
	Customer patron;
	ArrayList<Beverage> beverage = new ArrayList<>();

	public Order(int orderTime, Day orderDay, Customer cust) {
		
		this.orderTime = orderTime;
		patron = cust;
		this.orderDay = orderDay;
		patron.setName (cust.getName());
		patron.setAge(cust.getAge());
		
	}
	
	
	public int generateOrder() {
		Random rand = new Random();
		orderNumber = rand.nextInt(10000, 90000);
		return orderNumber;
		
	}
	
	public int getOrderNo() {
		return orderNumber;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public Day getOrderDay() {
		return orderDay;
	}
	
	public Customer getCustomer() {//MUST BE DEEP COPY
		Customer corn = new Customer(patron);
		return corn;
	}
	
	public Day getDay() {
		return orderDay;
	}


	
	@Override
	public int compareTo(Order o) {
		
		if (this.orderNumber > o.orderNumber) {
			return 1;
		}
		else if (this.orderNumber < o.orderNumber) {
			return -1;
		}
		else return 0;
			

	}

	@Override
	public boolean isWeekend() {
		if(this.orderDay == Day.SATURDAY || this.orderDay == Day.SUNDAY) {
			return true;
		}
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		
		Beverage Bev = beverage.get(itemNo);
		
		return Bev;
	}

	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		beverage.add(new Coffee (bevName, size, extraShot, extraSyrup));
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		beverage.add(new Alcohol(bevName, size, isWeekend()));
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		beverage.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}

	@Override
	public double calcOrderTotal() {
		double total =0.0;
		for(int i =0; i < beverage.size(); i ++) {
		total += beverage.get(i).calcPrice();
		System.out.println(beverage.get(i).calcPrice());
		}
		return total;
	}

	@Override
	public int findNumOfBeveType(Type type) {
		int num = 0;
		for(int i = 0; i < beverage.size(); i ++) {
			if(beverage.get(i).getType().equals(type)) {
				num++;
			}
		}
		return num;
	}
	
	
	public String toString() {
		//String representation of the order, Includes order number, time , day, customer name and age and the list of beverages
		String orderInfo = "Order Number: " + orderNumber + ", Time: " + orderTime + ", Day" + orderDay + ", Customer Name: " + patron.getName() + ", Customer Age: " + patron.getAge();
		for(int i = 0; i < beverage.size(); i ++) {
		orderInfo += "Beverage Ordered: " + beverage.get(i).toString();
		}
		return orderInfo;
	}




	public int getTotalItems() {
		// TODO Auto-generated method stub
		return beverage.size();
	}


	


	
	
	
	
	
	
	
	
	
	
	
}