
public class Property extends Object{

	
		private String city;
		private String propertyName;
		private double rentAmount;
		private String owner;
		Plot plot = new Plot();
		
		/*
		 * Constructors

		 * */

		public Property() {
			plot = new Plot();
			this.city = "";
			this.propertyName = "";
			this.rentAmount = 0.0;
			this.owner = "";
			
		}
		public Property(String propertyName, String city, double rentAmount, String owner) {
			this.city = city;
			this.propertyName = propertyName;
			this.rentAmount = rentAmount;
			this.owner = owner;
		}
		public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
			plot = new Plot(x,y,width,depth);
			this.city = city;
			this.propertyName = propertyName;
			this.rentAmount = rentAmount;
			this.owner = owner;
		}
		public Property(Property otherProperty) {
			this.city = otherProperty.city;
			this.propertyName = otherProperty.propertyName;
			this.rentAmount = otherProperty.rentAmount;
			this.owner = otherProperty.owner;
		}
		
		public String getPropertyName() {
			return this.propertyName;
		}
		public String getCity() {
			return this.city;
		}
		public double getRentAmount() {
			return this.rentAmount;
		}
		public String getOwner() {
			return this.owner;
		}
		
		public Plot getPlot() {

		plot = new Plot(plot);
		return plot;
		}
		
		
		public String toString() {
			String property = "";
			property += propertyName + "," + city + "," + owner + "," + rentAmount;
			return property;
		}
		
	}


