package oo.day03;
//super调用父类
public class SuperDemo {
	public static void main(String[] args) {
		Boo b = new Boo();
	}
}
class Aoo{
	Aoo(){
		System.out.println("父类构造");
	}
}
class Boo extends Aoo{
	Boo(){
		super();//默认调用父类无参构造
		System.out.println("子类构造");
	}
}