package multipleInheritence_using_interface;

public class Graduate implements Student, SoftwareEngineer{
	
	
	private String name;
	private String salary;
	public Graduate(String name, String salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getFood() {
		return "Rice, fish, meat";
	}

	@Override
	public String getBehaviour() {
		return "Eat, sleep, think, work";
	}

	@Override
	public String getRole() {
		return "buliding software";
	}

	@Override
	public String getSalary() {
		return salary;
	}

	@Override
	public String getDept() {
		return "Comp. Science";
	}

}
