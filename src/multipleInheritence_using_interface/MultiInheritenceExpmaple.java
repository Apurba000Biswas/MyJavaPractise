package multipleInheritence_using_interface;

public class MultiInheritenceExpmaple {
	
	
	public static void main(String[] args) {
		MultiInheritenceExpmaple obj = new MultiInheritenceExpmaple();
		obj.operation();
	}
	
	private void operation() {
		Human human = new Graduate("Apurba", "0");
		System.out.println("Name: " + human.getName());
		System.out.println("Food: " + human.getFood());
		System.out.println("Behavior: " + human.getBehaviour());
	}

}
