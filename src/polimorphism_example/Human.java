package polimorphism_example;

public class Human {
	
	private String name;
	private String residence;
	
	public Human(String name, String residence) {
		this.name = name;
		this.residence = residence;
	}
	
	public String getName() {
		return name;
	}
	
	public String getResidence() {
		return residence;
	}
	
	public String getScientificName() {
		return "Homo-sepience";
	}

}
