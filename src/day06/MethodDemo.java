package day06;
//方法演示
public class MethodDemo {
	public static void main(String[] args) {
		sayHi();
		say("lexi");//String name = "lexi";
		sayHello("zhangsan", 23);
		
		int n = sum(8,9);
		System.out.println(n);
	}
	
	
	public static int sum(int a,int b ){
		int c=a+b;
		return c;//c的类型必须是int
		//return a+b;
	}
	
	public static void sayHello(String name,int age){}
	
	public static void say(String name){
		System.out.println("hi,i am "+name);
	}
	
	//无返回值，无参数
	public static void sayHi(){
		System.out.println("Hi");
	}
}
