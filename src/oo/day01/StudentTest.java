package oo.day01;
//ѧ���������
public class StudentTest {
	public static void main(String[] args) {
		Student lexi = new Student();
		lexi.name = "lexi";
		lexi.age = 23;
		lexi.address = "hangzhou";
		lexi.study();
		lexi.eat();
		lexi.sayHi();
		
		Student li = new Student();
		li.name = "lisi";
		li.age = 26;
		li.address = "wenzhou";
		li.study();
		li.sayHi();
	}

}

