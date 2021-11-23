
public class Dog {
		private String name = "Clifford";
		private String size = "big"; 
		private int height = 163;
		private String color = "red";
		private int strength = 10000; 
		
		public void whoAmI() {
			System.out.println("Hi, my name's " + name + ", the " + size + " " + color + " dog!");
		}
		
		public int train() {
			strength*=3;
			System.out.println(strength);
			return strength;
		}
		
		public void whatColorAmI() {
			System.out.println("My color is " + color);
		}
		
		public void increaseMyHeight() {
			height+=1.5;
			System.out.println("I am now " + height + "cm"); 
		}
}
