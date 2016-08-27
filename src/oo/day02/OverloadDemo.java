package oo.day02;
//方法重载演示
public class OverloadDemo {
	public static void main(String[] args) {
		Aoo aoo = new Aoo();
		aoo.pay();//自动调用无参pay
		aoo.pay("abc");//自动调用String参数pay
	}

}

 class Aoo {
	void pay(){}
	void pay(String s){}
	void pay(int i,double d){}
	void pay(double d,int i){}
	
	//int pay(){}//编译错误，与返回值类型无关
	//void pay(double dou,int num){}//编译错误，与变量名无关，只考虑类型
}