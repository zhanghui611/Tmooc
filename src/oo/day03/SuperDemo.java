package oo.day03;
//super���ø���
public class SuperDemo {
	public static void main(String[] args) {
		Boo b = new Boo();
	}
}
class Aoo{
	Aoo(){
		System.out.println("���๹��");
	}
}
class Boo extends Aoo{
	Boo(){
		super();//Ĭ�ϵ��ø����޲ι���
		System.out.println("���๹��");
	}
}