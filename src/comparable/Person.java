package comparable;

public class Person implements Comparable<Person> {
	String name;
	int age;

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
	public int compareTo(Person another) {
		int result = 0;
		result = name.compareTo(another.name);
		if (result != 0)
			return result;
		else
			return age - another.age;
	}
}
