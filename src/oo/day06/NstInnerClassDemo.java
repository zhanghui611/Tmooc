package oo.day06;
//�����ڲ�����ʾ
public class NstInnerClassDemo {
	public static void main(String[] args) {
		//���󣬲��ܴ����ӿڶ���
		//IInter1 o = new IInter();
		//��ȷ������IInter1��ʵ�������
		IInter1 o = new IInter1(){
			//ʵ����ĳ�Ա
		};
		
		
		//����ʵ����������δ��д���󷽷�
		//IInter2 o2 = new IInter2(){};
		
		//��ȷ������ʵ����Ķ�����Ϊo2
		IInter2 o2 = new IInter2(){
			public void show(){
				System.out.println("Hi");
			}
		};
		//ͨ���������show����
		o2.show();
	}
}
interface IInter1{
}
interface IInter2{
	void show();
}