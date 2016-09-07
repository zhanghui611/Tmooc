package oo.day05;
//接口演示
public class InterfaceDemo {
	public static void main(String[] args) {
		//错误，接口不能被实例化
		//IInter i = new IInter();
		
		IInter1 i = new Goo();//向上造型
		i.a(); //Goo的a方法
		i.b(); //Goo的b方法
		//i.show();错误，点出来什么，看类型
	}
}
interface IInter1{
	void a();
	void b();
}
class Goo implements IInter1{
	void show(){}
	public void a(){}
	public void b(){}
}
interface IInter2{
	void c();
}
interface IInter3 extends IInter1{
	void m();
}
class Foo implements IInter3{
	public void a(){}
	public void b(){}
	public void m(){}
}
abstract class Coo{
	abstract void d();
}
class Doo extends Coo implements IInter1,IInter2{
	public void a(){}
	public void b(){}
	public void c(){}
	void d(){}
}
class Boo implements IInter1,IInter2{
	public void a(){}
	public void b(){}
	public void c(){}
}

class Aoo implements IInter1{
	public void a(){}
	public void b(){}
}

interface IInter{
	//接口中只能包含常量和抽象方法
	public static final double PI = 3.14159;
	int NUM = 5;//默认public static final
	
	public abstract void show();
	void say();//默认public abstract
	
	//int NUM2;//错误，常量必须声明同时初始化
	//void sayHi(){}//错误，不能包含普通方法
}