package Stream;

public class TeamMember {

	
	
	private String Name;
	private int age;
	
	
	public TeamMember(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "TeamMember [Name=" + Name + ", age=" + age + "]";
	}
	
	
	
	
	
}
