package oo.day06;
//��̬��ʾ
public class CastTest {
	public static void main(String[] args) {
		//��������
		//Aoo o1 = new Boo();	  //��������
		//Inter1 o2 = new Boo();//��������
		//Inter1 o3 = new Coo();//�������Ͳ�ƥ��
		
		//��������ʱ��������������ǿ����͵�
		//Aoo o1 = new Boo();
		//o1.b();//��ȷ
		//o1.num1 = 5;//������󣬵����ʲô������
		
		//ǿתʱ������
		Aoo o1 = new Boo();//��������
		Boo o2 = (Boo)o1;//o1ָ��Ķ�����Boo
		Inter1 o3 = (Inter1)o1;
		//o1ָ��Ķ�����Booʵ����Inter1�ӿ�
		
		//Coo o4 = (Coo)o1;//����ת���쳣
			//o1ָ��Ķ�����Coo�޹�
		//instanceΪtrue���������
		//1.����Ϊ������
		//2.����ʵ���˸ýӿ�
		if(o1 instanceof Coo){	//false
			Coo o4 = (Coo)o1;
		}
	}

}
interface Inter1{
	void a();
}
abstract class Aoo{
	abstract void b();
}
class Boo extends Aoo implements Inter1{
	int num1;
	void b(){};
	public void a(){};
}
class Coo extends Aoo{
	int num2;
	void c(){};
	void b(){}
}













