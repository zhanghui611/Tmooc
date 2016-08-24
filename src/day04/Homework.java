package day04;
import java.util.Scanner;
import org.junit.Test;

public class Homework {
	@Test
	public void test1(){
		//9+99+999+...+9999999999
		long sum=0;
		long num=0;
		for(int i=1;i<=10;i++){
			num = num*10+9;
			sum = sum+num;
		}
		System.out.println("9+99+999+...+9999999999="+sum);
	}
	
	@Test
	public void test2(){
		//1+1/2+1/3+...1/n	
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入整数（例如10）：");
		double sum = 0;
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			sum = sum +1.0/i;
		}
		System.out.println("sum="+sum);
	}

}
