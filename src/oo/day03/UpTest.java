package oo.day03;
//向上造型演示
public class UpTest {
	public static void main(String[] args) {
		/*
		Moo o = new Moo();
		o.m = 5;
		o.say();*/
		/*Noo o = new Noo();
		o.n=9;
		o.show();//本类
		o.m = 0;
		o.say();//父类*/
		//能点出来什么看类型
		Moo o = new Noo();//向上造型
		o.m = 4;
		o.say();
		//o.n = 0;
		//o.show();//错误，点不出来
		
	}
}
class Moo{
	int m;
	void say(){}
}
class Noo extends Moo{
	int n;
	void show(){}
}