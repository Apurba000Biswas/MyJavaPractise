package multipleInheritence;

public class Student extends Human{

	public Student(String name) {
		super(name);
	}

	@Override
	public String getSpecialBehave() {
		String spBehave = "Study, exams";
		return spBehave;
	}

}
