package java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1{
	String name;
	int age;
	
	public Student1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//only one sorting 
	
	void display() {
		System.out.println(name+" "+age);
	}
}

class namecomparator implements Comparator<Student1>{
	public int compare(Student1 s1,Student1 s2) {
		return s1.name.compareTo(s2.name);
	}
}

class agecomparator implements Comparator<Student1>{
	public int compare(Student1 s1,Student1 s2) {
		return s1.age-s2.age;
	}
}

public class Comparator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student1> s = new ArrayList<>();
		
		s.add(new Student1("anu",21));
		s.add(new Student1("sai",18));
		s.add(new Student1("raj",20));
		
		//sort with name
		System.out.println("sort with name : ");
		Collections.sort(s,new namecomparator());
		
		for(Student1 a : s) {
			a.display();
		}
		System.out.println();
		//sort with age
		System.out.println("sort with age : ");
		Collections.sort(s,new agecomparator());
		
		for(Student1 a : s) {
			a.display();
		}

	}

}
