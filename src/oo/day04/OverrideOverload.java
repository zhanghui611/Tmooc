package oo.day04;
//重载和重写的区别
public class OverrideOverload {
	public static void main(String[] args) {
		Aoo o = new Boo();//向上造型
		
		//重载时，看类型
		//重写时，看对象
		Coo c = new Coo();
		c.t(o);
	}

}
class Aoo{
	void show(){
		System.out.println("父类show");
	}
}
class Boo extends Aoo{
	void show(){
		System.out.println("子类show");
	}
}
class Coo{
	void t(Aoo o){
		System.out.println("父类参数");
		o.show();
	}
	void t(Boo o){
		System.out.println("子类参数");
		o.show();
	}
}
















