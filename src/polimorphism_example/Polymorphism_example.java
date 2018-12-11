package polimorphism_example;

public class Polymorphism_example {
	
	public static void main(String[] args) {
		Polymorphism_example obj = new Polymorphism_example();
		obj.opertaion();
	}
	
	
	private void opertaion() {
		Human human1 = new Bangladeshi("Apurba", "Dhaka-Mirpur");
		Human human2 = new Indian("Masum", "Kolkata");
		
		Human human = new Human("XYZ", "MNO");
		
		printState(human1);
		printState(human2);
		printState(human);
	}
	
	private void printState(Human human) {
		System.out.println("Human name is : " + human.getName());
		System.out.println("Human residence is : " + human.getResidence());
		System.out.println("Scientific Name is : " + human.getScientificName());
	}
	

}
