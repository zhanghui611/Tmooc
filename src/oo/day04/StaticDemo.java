package oo.day04;
//static 演示
public class StaticDemo {
	public static void main(String[] args) {
		//Hoo o1 = new Hoo();
		//o1.show();//1,1
		
		//Hoo o2 = new Hoo();
		//o2.show();//1,2
		
		//System.out.println(o1.b);
		//System.out.println(o2.b);
		//System.out.println(Hoo.b);//建议通过类名来访问
		//System.out.println(Hoo.a);//错误
		
		//Ioo.say();//静态方法由类名点来访问
		//Ioo.show();//错误，必须由对象来访问
		
		Joo o1 = new Joo();
		Joo o2 = new Joo();
	}
	
}
class Joo {//static块
	Joo(){
		System.out.println("111");
	}
	static{//加载类的时候被执行，只执行一次
			//因为类纸杯加载一次
		System.out.println("静态代码块");
	}
}

class Ioo{//static方法
	int a;
	static int b;
	void show(){
		a++;//隐式的this传递过来
		b++;
	}
	static void say(){
		b++;//没有隐式this传递
		//a++;//错误，没有隐式this传递
			//没有对象，而a属于对象的，所以错误
	}
}


class Hoo{//static成员变量
	int a;
	static int b;
	Hoo(){
		a++;
		b++;
	}
	void show(){
		System.out.println(a);
		System.out.println(b);
	}
}