package day02;
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int age = scanner.nextInt();
		if(age>=18&&age<=50){
			System.out.println("您的年龄是："+age);
		}else{
			System.out.println("您的年龄不在范围内！");
		}
	}

}
