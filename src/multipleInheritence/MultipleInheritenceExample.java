package multipleInheritence;

public class MultipleInheritenceExample {
	
	public static void main(String[] args) {
		MultipleInheritenceExample obj = new MultipleInheritenceExample();
		obj.operation();
	}
	
	
	private void operation() {
		ComputerScienceStudent cs = new ComputerScienceStudent("Apurba");
		System.out.println("Name: " + cs.getName());
		System.out.println("Food: " + cs.getFood());
		System.out.println("Behavior: " + cs.getBehavior());
		System.out.println("Special Behavior: " + cs.getSpecialBehave());
	}

}
