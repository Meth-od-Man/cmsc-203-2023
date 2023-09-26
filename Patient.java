
public class Patient {


		private String fName;
		private String mName;
		private String lName;
		private String address;
		private String city;
		private String state;
		private String emergencyContact;
		private String phoneNum;
		private String emergencyNum;
		private int zipcode;
		
		public Patient() {
		
		}
		
		public Patient(String fName, String mName, String lName) {
			this.fName = fName;
			this.mName = mName;
			this.lName = lName;
		}
		
		public Patient (String fName, String mName, String lName, String address, String city, String state, String emergencyContact, String phoneNum, String emergencyNum, int zipcode) {
			this.address = address;
			this.city = city;
			this.emergencyContact = emergencyContact;
			this.emergencyNum = emergencyNum;
			this.fName = fName;
			this.mName = mName;
			this.lName = lName;
			this.phoneNum = phoneNum;
			this.state = state;
			this.zipcode = zipcode;
		}
		
		
		public String getFName(String fName) {
			return this.fName;
		}
		public String getMName(String mName) {
			return this.mName;
		}
		public String getlName(String lName) {
			return this.lName;
		}
		public String getAddress(String address) {
			return this.address;
		}
		public String getCity(String city) {
			return this.city;
		}
		public String getState(String state) {
			return this.state;
		}
		public String getEmergencyContact(String emergencyContact) {
			return this.emergencyContact;
		}
		public String getPhoneNum(String phoneNum) {
			return this.phoneNum;
		}
		
		public String getEmergencyNum(String emergencyNum) {
			return this.emergencyNum;
		}
		
		public int getZipcode(int zipcode) {
			return this.zipcode;
		}
		
		
		public void setFName(String fName) {
			this.fName = fName;
		}
		public void setMName(String mName) {
			this.mName = mName;
		}
		public void setlName(String lName) {
			this.lName=lName;
		}
		public void setAddress(String address) {
			 this.address = address;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setState(String state) {
			this.state = state;
		}
		public void setEmergencyContact(String emergencyContact) {
			this.emergencyContact = emergencyContact;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		
		public void setEmergencyNum(String emergencyNum) {
			this.emergencyNum = emergencyNum;
		}
		
		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}
		
		
		public String buildFullName(String fName, String mName, String lName) {
			
			return fName +" "+ mName +" "+ lName;
		}
		
		public String buildAddress(String address, String city, String state, int zipcode) {
			return address + " " + city + " " + state + " " + zipcode ;
		}
		
		public String buildEmergencyContact(String emergencyContact, String emergencyNum) {
			return emergencyContact + " "+ emergencyNum;
		}
		
		public String toString () {
			String output = "  Name: " + fName + " " + mName + " "+ lName+
							"\n  Address: " + address + " " + city + " " + state + " " + zipcode+
							"\n  Emergency Contact: " + " " + emergencyContact + " " + emergencyNum;
			return output;
		}
		
		
		
	}


