


public class ManagementCompany extends Object{

	static final int MAX_PROPERTY = 5;
	static final int MGMT_DEPTH = 10;
	static final int MGMT_WIDTH = 10;
	private String name;
	private String taxID;
	private double mgmfee;
	
	ManagementCompany manage;
	
	
	

	
	private Property[] properties;
	private Plot plot;

	

	
	public ManagementCompany() {
		plot = new Plot();
		properties = new Property[MAX_PROPERTY];
		manage = new ManagementCompany();
		
		this.name = "";
		this.taxID = "";
		this.mgmfee = 0.0;
		
		
		
	}
	public ManagementCompany(String name, String taxID, double mgmFee) {
	plot = new Plot();
	this.name = name;
	this.taxID = taxID;
	this.mgmfee = mgmFee;

	properties = new Property[MAX_PROPERTY];
	
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		plot = new Plot( x, y, width, depth);
		this.name = name;
		this.taxID = taxID;
		this.mgmfee = mgmFee;
		
	
		properties = new Property[MAX_PROPERTY];
		
	}
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name ; 
		this.taxID = otherCompany.taxID ;
		this.mgmfee = otherCompany.mgmfee;
	}
	
	
	public int addProperty(String propertyName, String city, double rent, String owner) {
		Property property = new Property(propertyName, city, rent, owner);
		int f =0;
		for(int i = 0; i < properties.length; i ++) {
			if(properties[i] != null) {
				f++;
			}
			
		}

		int z =0;
		int index = 0;
		
		if(property != null) {
			if(plot.encompass(property.getPlot()) == true) {
				if(f > 0) {
				for(int i = 0; i <= f-1; i ++) {
					
					if(property.getPlot().overlaps(properties[i].getPlot()) == false) {
						
					}else return -4;
					}}
						for(int i = 0; i < properties.length; i ++) {
							
								if(properties[i] == null) {
									properties[i] = property;
									z ++;
									index = i;
									return index;
								}
								if(z >0) {
									i = properties.length+1;
								}
							
						}if(z == 0) {
							return -1;
						}
					
				
				}else return -3;
		}
		return -2;
			
		}
		
	public int addProperty(String propertyName, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property property = new Property(propertyName, city, rent, owner);
		int f =0;
		for(int i = 0; i < properties.length; i ++) {
			if(properties[i] != null) {
				f++;
			}
			
		}

		
		plot = new Plot( x, y, width, depth);
		int z = 0;
		int index = 0;
		
		
		if(property != null) {
			if(plot.encompass(property.getPlot()) == true) {
				if(f > 0) {
				for(int i = 0; i <= f-1; i ++) {
					
					if(property.getPlot().overlaps(properties[i].getPlot()) == false) {
					
					}else return -4;
					}}
						for(int i = 0; i < properties.length; i ++) {
							
								if(properties[i] == null) {
									properties[i] = property;
									z ++;
									index = i;
									return index;
								}
								if(z >0) {
									i = properties.length+1;
								}
							
						}if(z == 0) {
							return -1;
						}
					
				
				}else return -3;
		}
		return -2;
		
	}
		
	
	public int addProperty(Property property) {
		
		
		int f =0;
		for(int i = 0; i < properties.length; i ++) {
			if(properties[i] != null) {
				f++;
			}
		}
	
		
		int z = 0;
		int index = 0;
		
		if(property != null) {
			if(plot.encompass(property.getPlot()) == true) {
				if(f > 0) {
				for(int i = 0; i <= f-1; i ++) {
					
					if(property.getPlot().overlaps(properties[i].getPlot()) == true) {
					return -4;
					}
					}}
						for(int i = 0; i < properties.length; i ++) {
							
								if(properties[i] == null) {
									properties[i] = property;
									z ++;
									index = i;
									return index;
								}
								if(z >0) {
									i = properties.length+1;
								}
							
						}if(z == 0) {
							return -1;
						}
					
				
				}else return -3;
		}
		return -2;
		
	}
		//property1.propertyName = property.getPropertyName();
		//properties[1] = (property.getPropertyName(), property.getCity, property.getRentAmount, property.getOwner);
	
	

	public void removeLastProperty() {
		int z = 0;
		for(int i = properties.length-1; i >= 0; i --) {
			if(properties[i] != null) {
				properties[i] = null;
				z++;
			}
			if(z > 0) {
				i = -123456789;
			}
			
		}
	}
	
	public boolean isPropertiesFull() {
		
		for(int i = 0; i < properties.length; i ++) {
			if(properties[i] == null) {
				return false;
			}
		}
			return true;
	}
	public int getPropertiesCount() {
		int z =0;
		for(int i = 0; i < properties.length; i ++) {
			if(properties[i] != null) {
				z++;
			}
			
		}
		return z;
	}
	public double getTotalRent() {
		double z = 0.0;
		for(int i = 0; i < properties.length; i++) {
			if(properties[i] != null) {
			z += properties[i].getRentAmount();
		}}
		return z;
	}
	public Property getHighestRentPropperty() {
		double MAX = 0.0;
		int z = 0;
		for(int i = 0; i < properties.length;i ++) {
			if(properties[i] != null) {
			if(properties[i].getRentAmount() > MAX) {
				MAX = properties[i].getRentAmount();
				z = i;
			}
		}}
		
		return properties[z];
	}
	
	public boolean isMangementFeeValid() {
		if ((0.0< mgmfee) &&(mgmfee < 100.0)) {
			return true;
		}
		else return false;
	}
	
	public String getName() {
		return this.name;
	}
	public double getMgmFeePer() {
		return this.mgmfee;
	}
	public String getTaxID() {
		return this.taxID;
	}
	public Plot getPlot() {
		Plot plot2 = new Plot(plot);
		return plot2;
	}
	
	
	public String toString() {
		String stuff = "List of the properties for "+ this.name + ", taxID: " + this.taxID + "\n______________________________________________________\n";
		double totalRent = 0.0;
		double totalFee = 0.0;
		for(int i  = 0; i < properties.length; i++) {
			if(properties[i] != null) {
				stuff += properties[i].toString() + "\n______________________________________________________\n";
			}
			
			}
		for(int i  = 0; i < properties.length; i++) {
			if(properties[i] != null) {
				totalRent += properties[i].getRentAmount();
			}
			
			}
		totalFee = (totalRent * (this.mgmfee/100.0));
		stuff += "\n total management Fee: " + totalFee ;
		
		return stuff;
	}
	
	
	
	
}


