package oo.day04;

public class StaticFinalDemo {
	public static void main(String[] args) {
		//在编译时，直接将Aoo.PI替换为3.1415926
		System.out.println(Woo.PI);
		
		//在方法区中加载Woo.class
		//以及static成员，以及方法
		System.out.println(Woo.num);
	}

}
class Woo{
	//声明常量，必须声明同时初始化
	//建议所有字母大写
	static final double PI  = 3.1415926;
	static int num = 5;
}