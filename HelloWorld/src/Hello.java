
public class Hello {
	
	static void myFirstMethod() {
		//method is going to return no value
		System.out.println("HELLO THERE!");
	}
	
	void myNonStaticMethod() {
		System.out.println("HEY I AM NOT STATIC");
	}
	
	int myAddition() {
		int numberOne = 10;
		int numberTwo = 20;
		return numberOne + numberTwo; 
	}
	
	static int myStaticAddition() {
		int numberOne = 1;
		int numberTwo = 2;
		return numberOne + numberTwo;
	}

	public static void main(String[] args) {
		
		Vehicle herbie = new Vehicle();
		System.out.println(herbie.model);
		herbie.displayInformation();
		herbie.increaseAge();
//		Hello myObject = new Hello();
//		
//		myObject.myFirstMethod();
//		//don't need to create an instance of class if its trying to call a static method 
//		
//		myObject.myNonStaticMethod();
//		//do need to create an instance of class if you're trying to call a non-static method
//		
//		int result = myObject.myAddition();
//		//storing result of myAddition in a variable to use again
//		
//		System.out.println(result);
//		
//		int myStaticResult = myStaticAddition();
//		
//		System.out.println(myStaticResult);
//		myFirstMethod();
//		
//		System.out.println("Hello World");

	}

}
