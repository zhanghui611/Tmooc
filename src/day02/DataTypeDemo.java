package day02;

public class DataTypeDemo {

	public static void main(String[] args) {
		
		/*//int:����
		int a = 88;//88Ϊֱ������JavaĬ��Ϊint��
		//int b = 10000000000;//����int��Χ
		
		int b = 5/3;
		System.out.println(b);//1,С����������ȥ
		
		int m = 2147483647;//int�����ֵ
		m = m+1;//
		System.out.println(m);//-2147483648  ���  int����Сֵ
		*/
		
		//long:������
		/*
		long a = 88L;
		
		long b = 1000*1000*1000*1000*2L;
		System.out.println(b);//���
		
		long c =2L*1000*1000*1000*1000;
		System.out.println(c);//�����
		
		//��ȡ��1970.1.1��ʱ�����ڵĺ�����
		long time = System.currentTimeMillis();
		System.out.println(time);
		*/
		/*
		//double:������/С����
		double a =55.66;
		float b = 3.14f;
		
		double c = 3.0;
		double d = 2.9;
		System.out.println(d-c);
		//-0.10000000000000009
		//double��float�����������
		//����������ʹ��BigDecimal
		
		//����ʱ�����������Ϊ�������� double>int
		int e = 5/2;
		double f = 5/2;
		double g = 5.0/2;
		System.out.println(e);//2
		System.out.println(f);//2.0
		System.out.println(g);//2.5
		*/
		
		/*
		//char:�ַ��ͣ�ռ2���ֽڣ�ֻ�ܴ�һ���ַ�
		char c1 = 'A';//'A'Ϊ�ַ�ֱ����
		char c2 = 65;//65Ϊ'A'����Ӧ���루������
		System.out.println(c1);
		System.out.println(c2);
		
		//char c3 = '';//������󣬱������ַ�
		//char c4 = ''';//�������'Ϊ�����ַ�
		char c5 = '\'';//��ȷ��\'Ϊת���ַ�
		System.out.println(c5);
		
		//�ַ�ʵ���ϴ�ľ����������룩
		//'0' ��48 'a'��97  'A'��65
		int m = 2+2;
		int n = '2'+'2';
		System.out.println(m);//4
		System.out.println(n);//100
		
		//boolean:������ ռһ���ֽ�
		boolean a = true;
		boolean b = false;
		*/
		
		/**
		 * ��������ת�������ַ�ʽ
		 * 1.�Զ�����ת������С����
		 * 2.ǿ������ת�����Ӵ�С
		 */
		
		/*
		int a = 55;
		long b = a;//�Զ�����ת��
		int c = (int)b;//ǿ������ת��
		
		short s1 = 5;
		short s2 = 6;
		//short s3 = s1+s2;//����s1+s2Ϊint����
		short s3 = (short)(s1+s2);
		
		//byte b1 = 128;//����byte���Χ��127
		 */
		
		//��ϰ1
		int a =55;
		long b = a;//�Զ�ת��
		int c = (int)b;//ǿ��ת��
		
		//��ϰ2
		double dou = 5.55;
		int f = (int)dou;//ǿ��ת�������ȶ�ʧ
		
		//��ϰ3
		byte b1 = 10;
		byte b2 = 15;
		byte b3 = (byte)(b1+b2);
	}

}
