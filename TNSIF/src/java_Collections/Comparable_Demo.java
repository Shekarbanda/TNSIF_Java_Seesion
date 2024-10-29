package java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	String name;
	int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//only one sorting 
	public int compareTo(Student other) {
		return this.age-other.age;
	}
	
	
	void display() {
		System.out.println(name+" "+age);
	}
}


public class Comparable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> s = new ArrayList<>();
		
		s.add(new Student("anu",21));
		s.add(new Student("anu",18));
		s.add(new Student("anu",20));
		
		Collections.sort(s);
		
		for(Student a : s) {
			a.display();
		}
	}

}
