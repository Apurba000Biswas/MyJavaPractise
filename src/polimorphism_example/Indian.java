package polimorphism_example;

public class Indian extends Human{
	
	private String name;
	private String residence;
	
	public Indian(String name, String residence) {
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
		String sciName = "IND//" + super.getScientificName();
		return sciName;
	}
}
