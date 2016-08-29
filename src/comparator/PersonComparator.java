package comparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int result = 0;
		result = p1.name.compareTo(p2.name);
		if (result != 0)
			return result;
		else
			return p1.age - p2.age;
	}
}
