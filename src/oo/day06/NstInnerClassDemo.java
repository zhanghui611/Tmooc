package oo.day06;
//匿名内部类演示
public class NstInnerClassDemo {
	public static void main(String[] args) {
		//错误，不能创建接口对象
		//IInter1 o = new IInter();
		//正确，创建IInter1的实现类对象
		IInter1 o = new IInter1(){
			//实现类的成员
		};
		
		
		//错误，实现类类体中未重写抽象方法
		//IInter2 o2 = new IInter2(){};
		
		//正确，创建实现类的对象，名为o2
		IInter2 o2 = new IInter2(){
			public void show(){
				System.out.println("Hi");
			}
		};
		//通过对象调用show方法
		o2.show();
	}
}
interface IInter1{
}
interface IInter2{
	void show();
}