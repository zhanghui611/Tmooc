package day03;
import java.util.Scanner;
public class IsYear {

	public static void main(String[] args) {
	//闰年判断程序
	//条件1：能被4整除但是不能被100整除
		//year%4==0 year%100!=0
	//条件2：或者能被400整除
		//year%400==0
	Scanner scan = new Scanner(System.in);
	
	System.out.println("请输入年份");
	int year = scan.nextInt();
	scan.close();
	
	boolean b = year%4==0 && year%100!=0
			 	|| year%400==0;
	
	String str = b? year +"是润年" : year+"不是闰年";
	System.out.println(str);
	
	}

}
