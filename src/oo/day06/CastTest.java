package oo.day06;
//多态演示
public class CastTest {
	public static void main(String[] args) {
		//向上造型
		//Aoo o1 = new Boo();	  //向上造型
		//Inter1 o2 = new Boo();//向上造型
		//Inter1 o3 = new Coo();//错误，类型不匹配
		
		//向上造型时，点出来的内容是看类型的
		//Aoo o1 = new Boo();
		//o1.b();//正确
		//o1.num1 = 5;//编译错误，点出来什么看类型
		
		//强转时看对象
		Aoo o1 = new Boo();//向上造型
		Boo o2 = (Boo)o1;//o1指向的对象是Boo
		Inter1 o3 = (Inter1)o1;
		//o1指向的对象是Boo实现了Inter1接口
		
		//Coo o4 = (Coo)o1;//类型转换异常
			//o1指向的对象与Coo无关
		//instance为true两种情况：
		//1.对象为该类型
		//2.对象实现了该接口
		if(o1 instanceof Coo){	//false
			Coo o4 = (Coo)o1;
		}
	}

}
interface Inter1{
	void a();
}
abstract class Aoo{
	abstract void b();
}
class Boo extends Aoo implements Inter1{
	int num1;
	void b(){};
	public void a(){};
}
class Coo extends Aoo{
	int num2;
	void c(){};
	void b(){}
}













