package day02;
//变量的演示
public class VarDemo {
	
	public static void main(String[] args) {
		/*
		int num;//声明一个整型变量，名为num
		//int a,b=2,c;//声明3个int型的变量，名为a,b,c，b的值为2
		
		//d=4;//编译错误，d没有声明
		
		int score,_score,a1,a$,$abc;
		int age,teacherAge,javaTeacherAge;
		//int 1a;//编译错误，不能以数字开头
		//int class;//编译错误，不能使用关键字
		//Score = 25;//编译错误，区分大小写
		int myscore;//可以，但不建议
		int aa;//可以，但不建议
		*/
		
		int a;
		//System.out.println(a);//编译错误，a未初始化
		//int b=a+1;//编译错误，a未初始化
		
		int b=3;//声明同时初始化（第一次赋值）
		int c;
		c=5;//先声明，再初始化
		
		//int d = 2.5;//编译错误，类型不匹配
		int e=10;
		e = e+100;//110
		System.out.println(e);
		
	}

}
