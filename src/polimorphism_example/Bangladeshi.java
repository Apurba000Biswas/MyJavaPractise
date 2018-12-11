package polimorphism_example;

public class Bangladeshi extends Human{
	
	private String name;
	private String residence;

	public Bangladeshi(String name, String residence) {
		super(name, residence);
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
		String sciName = "BD//" + super.getScientificName();
		return sciName;
	}
	
}
