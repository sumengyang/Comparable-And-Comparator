package comparable;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append("name : " + name + "\tage = " + age);
		return sbBuilder.toString();
	}

	@Override
	public int compareTo(Person another) {
		int result = 0;
		result = name.compareTo(another.name);
		if (result != 0)
			return result;
		else
			return age - another.age;
	}
}
