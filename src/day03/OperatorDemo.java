package day03;
//��ʾ�����
public class OperatorDemo {

	public static void main(String[] args) {
		//������+��-��*��/��%��++��--
		//++��-- ����ʹ�ã���ǰ�ں�û�в��
		//��ʹ��ʱ�����в��ģ�
		// ++��ǰ��������,��ʹ��
		// ++�ں���ʹ��,������/������
		
		/*
		int n = 5;
		//n++;//����
		++n;//����
		System.out.println(n);//6
		*/
		
		/*
		int n = 5;
		int m = n++;
		System.out.println(n);//6
		System.out.println(m);//5
		
		int a =5;
		int b = ++a;
		System.out.println(a);//6
		System.out.println(b);//6
		
		//���Ҳ����ʹ��
		int c = 5,d = 5;
		System.out.println(c++);//5
		System.out.println(++d);//6
		*/
		
		/*
		//��ϰ1
		int a = 2;
		//a++;//3
		++a;//3
		System.out.println(a);
		
		//��ϰ2
		int b = 5;
		int c = b++;
		System.out.println(b);//6
		System.out.println(c);//5
		
		//��ϰ3
		int d = 5;
		int e = ++d;
		System.out.println(d);//6
		System.out.println(e);//6
		
		//��ϰ4
		int m = 5;
		int n = 5;
		System.out.println(m++);//5
		System.out.println(++n);//6
		*/
		
		/*
		//��ϵ���㣺>,<,>=,<=,==,!=
		int a = 5,b = 8,c =5;
		boolean b1 = a>b;
		System.out.println(b1);//false
		System.out.println(b>c);//true
		System.out.println(a==c);//true;
		System.out.println(a>=c);//true
		*/
		
		//�߼����㣺�ǽ����ڹ�ϵ����Ļ����ϵ�--&&��||����
		
		//��ֵ���㣺=��+=��-=��*=��/=��%=
		/*
		int a;
		a = 5;//��ֵ���㣨���Ÿ�ֵ��
		System.out.println(a);//5
		a += 10;//a = a+10
		System.out.println(a);//15
		a *=2;//a = a*2
		System.out.println(a);//30
		*/
		
		//�������㣺+ ʵ���ַ���������
		//+ ����Ϊ����ʱ�����ӷ�����
		//+ ������һ��Ϊ�ַ�����""��ʱ��������
		/*
		int a = 10;
		System.out.println(a);//10
		System.out.println("a=");//a=
		System.out.println("a="+a);//a=10;
		
		int b = 200;
		System.out.println("b��ֵ��"+200);//b��ֵ��200
		
		int c = 100;
		int d = 200;
		System.out.println(c+d+"");//"300";
		System.out.println(""+c+d);//100200
		*/
		
		//��������Ŀ�����㣺boolean���ʽ  ? ���ʽ1 : ���ʽ2 ;
		int a =5;
		int b = 6;
		int max = a>b ? a : b;
		System.out.println(max);
		
		
	}

}







