package oo.day04;
//static ��ʾ
public class StaticDemo {
	public static void main(String[] args) {
		//Hoo o1 = new Hoo();
		//o1.show();//1,1
		
		//Hoo o2 = new Hoo();
		//o2.show();//1,2
		
		//System.out.println(o1.b);
		//System.out.println(o2.b);
		//System.out.println(Hoo.b);//����ͨ������������
		//System.out.println(Hoo.a);//����
		
		//Ioo.say();//��̬������������������
		//Ioo.show();//���󣬱����ɶ���������
		
		Joo o1 = new Joo();
		Joo o2 = new Joo();
	}
	
}
class Joo {//static��
	Joo(){
		System.out.println("111");
	}
	static{//�������ʱ��ִ�У�ִֻ��һ��
			//��Ϊ��ֽ������һ��
		System.out.println("��̬�����");
	}
}

class Ioo{//static����
	int a;
	static int b;
	void show(){
		a++;//��ʽ��this���ݹ���
		b++;
	}
	static void say(){
		b++;//û����ʽthis����
		//a++;//����û����ʽthis����
			//û�ж��󣬶�a���ڶ���ģ����Դ���
	}
}


class Hoo{//static��Ա����
	int a;
	static int b;
	Hoo(){
		a++;
		b++;
	}
	void show(){
		System.out.println(a);
		System.out.println(b);
	}
}