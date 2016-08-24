package day03;
import java.util.Scanner;
import org.junit.Test;

public class Again {
	@Test
	public void test1(){
		//判断是否是闰年
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份（例如：2012）");
		int year = scanner.nextInt();
		if(year%400==0||year%4==0&&year%100!=0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
	
	@Test
	public void test2(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份（例如：2012）");
		int year = scanner.nextInt();
		boolean isYear = (year%4==0&&year%100!=0)||year%400==0;
		String msg = isYear?year+"是闰年":year+"不是闰年";
		System.out.println(msg);
	}
}
