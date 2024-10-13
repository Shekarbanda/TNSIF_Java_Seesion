package java_session;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface Demo{
	void getname();
}

class name3 implements Demo{
	public void getname() {
		System.out.println("hello");
	}
}

public class FunInterfaceDemo {
	public static void main(String[] args) {
		name3 obj = new name3();
		obj.getname();
	}
}
