package oo.day02;
//����������ʾ
public class OverloadDemo {
	public static void main(String[] args) {
		Aoo aoo = new Aoo();
		aoo.pay();//�Զ������޲�pay
		aoo.pay("abc");//�Զ�����String����pay
	}

}

 class Aoo {
	void pay(){}
	void pay(String s){}
	void pay(int i,double d){}
	void pay(double d,int i){}
	
	//int pay(){}//��������뷵��ֵ�����޹�
	//void pay(double dou,int num){}//���������������޹أ�ֻ��������
}