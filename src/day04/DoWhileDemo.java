package day04;
import java.util.Scanner;
//do..while��ʾ
public class DoWhileDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pwd;
		do{
			System.out.println("����������");
			pwd = scan.nextInt();
		}while(pwd!=123);
		System.out.println("over");
	}

}
