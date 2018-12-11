package multipleInheritence;

public class ComputerScienceStudent extends Student{

	public ComputerScienceStudent(String name) {
		super(name);
	}
	
	@Override
	public String getSpecialBehave() {
		String spbehave = super.getSpecialBehave() + ", " + "building Software";
		return spbehave;
	}

}
