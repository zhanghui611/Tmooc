package oo.day04;

public class StaticFinalDemo {
	public static void main(String[] args) {
		//�ڱ���ʱ��ֱ�ӽ�Aoo.PI�滻Ϊ3.1415926
		System.out.println(Woo.PI);
		
		//�ڷ������м���Woo.class
		//�Լ�static��Ա���Լ�����
		System.out.println(Woo.num);
	}

}
class Woo{
	//������������������ͬʱ��ʼ��
	//����������ĸ��д
	static final double PI  = 3.1415926;
	static int num = 5;
}