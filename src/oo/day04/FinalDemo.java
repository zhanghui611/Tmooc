package oo.day04;
//final��ʾ
public class FinalDemo {
	public static void main(String[] args) {

	}
}
class Zoo{}
final class Xoo extends Zoo{}//���Լ̳б����
//class Yoo extends Xoo{}//����final�����಻�ܱ��̳�
class Loo{//final���η���---���ɱ���д
	void show(){}
	final void say(){}
}
class Moo extends Loo{
	void show(){}
	//void say(){}//����final�������ܱ���д
}
class Koo{//final���α���---���ܸı䣬�õñȽ���
	final int a = 5;//����ͬʱ��ʼ��
	final int b;
	Koo(){
		b = 5;//�����������ڹ����г�ʼ��
	}
	void show(){
		final int c;//Ӧ���ʼ���Ϊ��
		//System.out.println(c);//����cû��ֵ
		c = 5;
		System.out.println(c);
	}
	void say(){
		//a  = 88;//����final���εı������ܸı�
	}
}













