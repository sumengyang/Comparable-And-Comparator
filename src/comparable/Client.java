package comparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Person stu[] = { 
				new Person("����", 23), 
				new Person("����", 26),
				new Person("����", 22) };
		Arrays.sort(stu);
		System.out.println(stu[0].toString());
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("zhangsan", 31));
		list.add(new Person("lisi", 30));
		list.add(new Person("wangwu", 35));
		Collections.sort(list);
		System.out.println(list);
	}
}
