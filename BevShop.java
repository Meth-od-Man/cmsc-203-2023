import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BevShop implements BevShopInterface{
	int MAX_FRUIT = 5;	
	 
	static final int MAX_ORDER_FOR_ALCOHOL = 3;
	 
	int MAX_TIME= 23;
	 
	static final int MIN_AGE_FOR_ALCOHOL = 21;
	 
	int MIN_TIME= 8;
	
	ArrayList<Order> order = new ArrayList<>();
	
	
	public BevShop() {
	
		
	}

	

	@Override
	public boolean isValidTime(int time) {
		if(time < MAX_TIME && time > MIN_TIME) {
			return true;
		}
		else return false;
	}

	@Override
	public int getMaxNumOfFruits() {
		// TODO Auto-generated method stub
		return MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() {
		// TODO Auto-generated method stub
		return MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		if(numOfFruits <= MAX_FRUIT) {
		return false;
		}
		else return true;
	}

	@Override
	public int getMaxOrderForAlcohol() {
		// TODO Auto-generated method stub
		return MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() {
		
		if( order.get(0).findNumOfBeveType(Type.ALCOHOL) < 4) {
			return true;
		}
		else return false;
	}

	@Override
	public int getNumOfAlcoholDrink() {
		return order.get(order.size()).findNumOfBeveType(Type.ALCOHOL);
	}

	@Override
	public boolean isValidAge(int age) {
		if(age >= MIN_AGE_FOR_ALCOHOL) {
			return true;
		}
		return false;
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Customer cust = new Customer(customerName, customerAge);
		order.add( new Order(time, day, cust));
		
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		
		
		//String bevName, Type type, Size size
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		order.get(order.size()).addNewBeverage(bevName, size);
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		order.get(order.size()).addNewBeverage(bevName, size, numOfFruits, addProtein);
		
	}

	@Override
	public int findOrder(int orderNo) {
		for(int i = 0; i < order.size(); i ++) {
			if(order.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		
		return order.get(orderNo).calcOrderTotal();
		
	}

	@Override
	public double totalMonthlySale() {
		double orderTotal = 0.0;
		for(int i = 0; i < order.size(); i ++) {
		orderTotal += order.get(i).calcOrderTotal();
		}
		return orderTotal;
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		return order.size();
	}

	@Override
	public Order getCurrentOrder() {
		// TODO Auto-generated method stub
		Order order2 = order.get(order.size());
		return order2;
	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		Order order2 = order.get(index);
		return order2;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		for(int i = 0; i < order.size(); i ++) {
			Collections.sort(order);
		}
		
		for(int i = 0; i < order.size(); i ++) {
			System.out.println(order.get(i));
		}
	
	}
	




}
