package oo.day04.vistor;
import oo.day04.Doo;//声明类

public class Foo {
	void show(){
		Doo o = new Doo();
		o.a = 5;
		//o.b = 5;//错误，本来，同包类，子类
		//o.c = 5;//错误，本类，同包类
		//o.d = 5;//错误，本类
	}
}
class Goo extends Doo{
	void show(){
		a = 5;
		b = 5;
		//c = 5;//错误，本类，同包类
		//d = 5;//错误，本类
	}
}
