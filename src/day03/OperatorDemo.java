package day03;
//演示运算符
public class OperatorDemo {

	public static void main(String[] args) {
		//算术：+，-，*，/，%，++，--
		//++，-- 单独使用，在前在后没有差别
		//在使用时，是有差别的：
		// ++在前，先运算,再使用
		// ++在后，先使用,再自增/减运算
		
		/*
		int n = 5;
		//n++;//自增
		++n;//自增
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
		
		//输出也是在使用
		int c = 5,d = 5;
		System.out.println(c++);//5
		System.out.println(++d);//6
		*/
		
		/*
		//练习1
		int a = 2;
		//a++;//3
		++a;//3
		System.out.println(a);
		
		//练习2
		int b = 5;
		int c = b++;
		System.out.println(b);//6
		System.out.println(c);//5
		
		//练习3
		int d = 5;
		int e = ++d;
		System.out.println(d);//6
		System.out.println(e);//6
		
		//练习4
		int m = 5;
		int n = 5;
		System.out.println(m++);//5
		System.out.println(++n);//6
		*/
		
		/*
		//关系运算：>,<,>=,<=,==,!=
		int a = 5,b = 8,c =5;
		boolean b1 = a>b;
		System.out.println(b1);//false
		System.out.println(b>c);//true
		System.out.println(a==c);//true;
		System.out.println(a>=c);//true
		*/
		
		//逻辑运算：是建立在关系运算的基础上的--&&，||，！
		
		//赋值运算：=，+=，-=，*=，/=，%=
		/*
		int a;
		a = 5;//赋值运算（最后才赋值）
		System.out.println(a);//5
		a += 10;//a = a+10
		System.out.println(a);//15
		a *=2;//a = a*2
		System.out.println(a);//30
		*/
		
		//连接运算：+ 实现字符串的连接
		//+ 左右为数字时，做加法运算
		//+ 左右有一边为字符串（""）时，做连接
		/*
		int a = 10;
		System.out.println(a);//10
		System.out.println("a=");//a=
		System.out.println("a="+a);//a=10;
		
		int b = 200;
		System.out.println("b的值是"+200);//b的值是200
		
		int c = 100;
		int d = 200;
		System.out.println(c+d+"");//"300";
		System.out.println(""+c+d);//100200
		*/
		
		//条件（三目）运算：boolean表达式  ? 表达式1 : 表达式2 ;
		int a =5;
		int b = 6;
		int max = a>b ? a : b;
		System.out.println(max);
		
		
	}

}







