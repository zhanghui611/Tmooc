package oo.day03;
//����������ʾ
public class UpTest {
	public static void main(String[] args) {
		/*
		Moo o = new Moo();
		o.m = 5;
		o.say();*/
		/*Noo o = new Noo();
		o.n=9;
		o.show();//����
		o.m = 0;
		o.say();//����*/
		//�ܵ����ʲô������
		Moo o = new Noo();//��������
		o.m = 4;
		o.say();
		//o.n = 0;
		//o.show();//���󣬵㲻����
		
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