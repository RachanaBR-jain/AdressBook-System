public class AddressBookSystem {
	public static void main(String[] args) {
		Address address1=new Address("Banglore","Karnataka",577124);
		Address address2=new Address("Manglore","Karnataka",19890);
		
		addresss person1=new 
addresss("B,R","Rachana",address1,1234567890,"br19rachana@gmail.com");
		System.out.println(person1.toString());

		addresss person2 =new 
addresss("Disha","Kanavadhe",address2,1357803456,"disha@gmail.com");
		person1.setaddress(address2); //here we are setting address2 to person1
		person1.setFirstName("Rachitha");
		person1.setLastName("Jain");

		
		System.out.println(person1.toString());
		System.out.println(person2.toString());

		
	}
}


class addresss
{
	private String firstName;
	private String lastName;
	Address address;
	private int phone_number;
	private String email;

	
	public addresss(String firstName, String lastName, Address address, int 
phone_number, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone_number = phone_number;
		this.email = email;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setaddress(Address address) {
		this.address = address;
	}


	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public Address getAddress() {
		return address;
	}


	public int getPhone_number() {
		return phone_number;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "AddressBookSystem [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address+ ", phone_number=" + phone_number + ", email=" + email + "]";
	}
}



