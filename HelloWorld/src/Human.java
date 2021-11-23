
public class Human {

	String firstName;
	String lastName;
	int age;
	int heightCM;
	
	public Human(String FirstName, String LastName, int myAge, int height) {
		firstName = FirstName;
		lastName = LastName;
		age = myAge;
		heightCM = height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human amira = new Human("Amira", "Begum", 22, 163);
		System.out.println(amira.firstName); 

	}

}
