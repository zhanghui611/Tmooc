package oo.day04;
//���غ���д������
public class OverrideOverload {
	public static void main(String[] args) {
		Aoo o = new Boo();//��������
		
		//����ʱ��������
		//��дʱ��������
		Coo c = new Coo();
		c.t(o);
	}

}
class Aoo{
	void show(){
		System.out.println("����show");
	}
}
class Boo extends Aoo{
	void show(){
		System.out.println("����show");
	}
}
class Coo{
	void t(Aoo o){
		System.out.println("�������");
		o.show();
	}
	void t(Boo o){
		System.out.println("�������");
		o.show();
	}
}
















