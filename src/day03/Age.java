package day03;
import java.util.Scanner;//1

//接收用户输入的年龄，判断是否在18-50之间
public class Age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//2
		
		System.out.println("请输入您的年龄");
		int age = scan.nextInt();//3
		boolean b = age>=18 && age<=50;
		System.out.println(b);
		scan.close();//4 可有可无
	}

}
