
public class Lion {
			private String name = "Simba";
			private int age = 3;
			private int hunger = 99;
			private String dadsName = "Mufasa"; 
			
			
			public void myName() {
				System.out.println(name);
			}
			
			public void birthday() {
				age++;
				System.out.println(age); 
			}
			
			public int train() {
				hunger+=25;
				System.out.println(hunger);
				return hunger;
			}
			
			public String fathersName() {
				String displayMessage = String.format("My dad is called %s", dadsName);
				System.out.println(displayMessage);
				return dadsName; 
			}
}
