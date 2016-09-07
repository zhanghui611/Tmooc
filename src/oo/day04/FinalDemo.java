package oo.day04;
//final演示
public class FinalDemo {
	public static void main(String[] args) {

	}
}
class Zoo{}
final class Xoo extends Zoo{}//可以继承别的类
//class Yoo extends Xoo{}//错误，final修饰类不能被继承
class Loo{//final修饰方法---不可被重写
	void show(){}
	final void say(){}
}
class Moo extends Loo{
	void show(){}
	//void say(){}//错误，final方法不能被重写
}
class Koo{//final修饰变量---不能改变，用得比较少
	final int a = 5;//声明同时初始化
	final int b;
	Koo(){
		b = 5;//先声明，再在构造中初始化
	}
	void show(){
		final int c;//应用率几乎为零
		//System.out.println(c);//错误，c没有值
		c = 5;
		System.out.println(c);
	}
	void say(){
		//a  = 88;//错误，final修饰的变量不能改变
	}
}













