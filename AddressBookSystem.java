public class AddressBookSystem {
	public static void main(String[] args) {
		Address address=new Address("Banglore","Karnataka",577124);
		Contacts person1=new Contacts("B,R","Rachana",address,1234567890,"br19rachana@gmail.com");
		Contacts person2 =new Contacts("Disha","Kanavadhe",address,1357803456,"disha@gmail.com");
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());

		
	}
}


class Contacts
{
	private String firstName;
	private String lastName;
	Address contact;
	private int phone_number;
	private String email;

	
	public Contacts(String firstName, String lastName, Address contact, int phone_number, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.phone_number = phone_number;
		this.email = email;
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public Address getContact() {
		return contact;
	}


	public int getPhone_number() {
		return phone_number;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "AddressBookSystem [firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact
				+ ", phone_number=" + phone_number + ", email=" + email + "]";
	}
}



