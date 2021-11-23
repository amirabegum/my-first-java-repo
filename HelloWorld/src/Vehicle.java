
public class Vehicle {
		String name = "Herbie";
		String model = "Beetle";
		private int age = 1;
		
		public void displayInformation() {
			System.out.println(name);
			System.out.println(model);
		}
		
		public void increaseAge() {
			age++;
			System.out.println(age);
		}
}
