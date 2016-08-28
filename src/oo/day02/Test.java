package oo.day02;

public class Test {
	public static void main(String[] args) {
		System.out.println("原始：");
		T t = new T(2,3);
		t.print();
		
		System.out.println("下落后：");
		t.drop();
		t.print();
	}

}
