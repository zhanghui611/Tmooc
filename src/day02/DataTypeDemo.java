package day02;

public class DataTypeDemo {

	public static void main(String[] args) {
		
		/*//int:整型
		int a = 88;//88为直接量，Java默认为int型
		//int b = 10000000000;//超出int范围
		
		int b = 5/3;
		System.out.println(b);//1,小数无条件舍去
		
		int m = 2147483647;//int的最大值
		m = m+1;//
		System.out.println(m);//-2147483648  溢出  int的最小值
		*/
		
		//long:长整型
		/*
		long a = 88L;
		
		long b = 1000*1000*1000*1000*2L;
		System.out.println(b);//溢出
		
		long c =2L*1000*1000*1000*1000;
		System.out.println(c);//不溢出
		
		//获取自1970.1.1零时到现在的毫秒数
		long time = System.currentTimeMillis();
		System.out.println(time);
		*/
		/*
		//double:浮点型/小数型
		double a =55.66;
		float b = 3.14f;
		
		double c = 3.0;
		double d = 2.9;
		System.out.println(d-c);
		//-0.10000000000000009
		//double和float都有舍入误差
		//想解决，可以使用BigDecimal
		
		//运算时以最大类型作为最终类型 double>int
		int e = 5/2;
		double f = 5/2;
		double g = 5.0/2;
		System.out.println(e);//2
		System.out.println(f);//2.0
		System.out.println(g);//2.5
		*/
		
		/*
		//char:字符型，占2个字节，只能存一个字符
		char c1 = 'A';//'A'为字符直接量
		char c2 = 65;//65为'A'所对应的码（整数）
		System.out.println(c1);
		System.out.println(c2);
		
		//char c3 = '';//编译错误，必须有字符
		//char c4 = ''';//编译错误，'为特殊字符
		char c5 = '\'';//正确，\'为转义字符
		System.out.println(c5);
		
		//字符实际上存的就是整数（码）
		//'0' 码48 'a'码97  'A'码65
		int m = 2+2;
		int n = '2'+'2';
		System.out.println(m);//4
		System.out.println(n);//100
		
		//boolean:布尔型 占一个字节
		boolean a = true;
		boolean b = false;
		*/
		
		/**
		 * 数据类型转换：两种方式
		 * 1.自动类型转换：从小到大
		 * 2.强制类型转换：从大到小
		 */
		
		/*
		int a = 55;
		long b = a;//自动类型转换
		int c = (int)b;//强制类型转换
		
		short s1 = 5;
		short s2 = 6;
		//short s3 = s1+s2;//错误，s1+s2为int类型
		short s3 = (short)(s1+s2);
		
		//byte b1 = 128;//错误，byte最大范围是127
		 */
		
		//练习1
		int a =55;
		long b = a;//自动转换
		int c = (int)b;//强制转化
		
		//练习2
		double dou = 5.55;
		int f = (int)dou;//强制转换，精度丢失
		
		//练习3
		byte b1 = 10;
		byte b2 = 15;
		byte b3 = (byte)(b1+b2);
	}

}
