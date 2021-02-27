public class Address {
	String city;
	String state;
	int zip;
	public Address(String city, String state, int zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
//<<<<<<< UC3-editExitingUser


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


//
	
	
//>>>>>>> master
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
//<<<<<<< UC3-editExitingUser

//=======
	
//>>>>>>> master


}

