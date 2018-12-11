package multipleInheritence;

public abstract class Human {
	
	
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFood() {
		String food  = "Rice, Meat, Fish, vagitable";
		return food;
	}
	
	public String getBehavior() {
		String behav = "Eat, sleep, think";
		return behav;
	}
	
	public abstract String getSpecialBehave();
}
