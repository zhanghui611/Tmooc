package day03;
import java.util.Scanner;

import org.junit.Test;
public class HomeWork {
	@Test
	public void test1(){
		//求两个整数的最大值
		Scanner scan = new Scanner(System.in);
		System.out.println("输入两个整数a,b");
		int a =scan.nextInt();
		int b = scan.nextInt();
		
		int max = a>b?a:b;
		System.out.println("max="+max);
	}
	
	@Test
	public void test2(){
		//求三个整数的最大值
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三个整数a,b,c");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = 0;
		if(a>max){
			max = a;
		}
		if(b>max){
			max = b;
		}
		if(c>max){
			max = c;
		}
		System.out.println("max="+max);
	}
	
	@Test
	public void text3(){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三个整数a,b,c");
		int array1[] = new int[3];//数组的声明
		//int[] array2 = new int[3];//数组的声明
		//int[] array3 = new int[]{1,2,3};//数组的声明以及初始化
		int max = 0;
		int num = 0;
		for(int i=0;i<array1.length;i++){
			num = scan.nextInt();
			array1[i] = num;
		}
		for(int i=0;i<array1.length;i++){
			if(array1[i]>max){
				max = array1[i];
			}
		}
		System.out.println("max="+max);
	}
	
	@Test
	public void text4(){
		//编写三个数值的排序程序
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三个整数a,b,c");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a>b){
			int t = a;
			a = b;
			b = t;
		}
		if(a>c){
			int t = a;
			a = c;
			c = t;
		}
		if(b>c){
			int t = b;
			b = c;
			c = t;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	
	@Test
	public void text5(){
		//个人所得税
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的工资");
		double salary = scan.nextDouble();
		double tarSalary = salary - 3500;
		double tax=0;
		if(tarSalary<1500){
			tax = tarSalary*0.03-0;
		}else if(tarSalary<=4500){
			tax = tarSalary*0.1-105;
		}else if(tarSalary<=9000){
			tax = tarSalary*0.2-555;
		}
		System.out.println("税："+tax);
	}
	
	@Test
	public void text6(){
		//输入年份和月份，输出该月的天数（switch-case）
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份，月份");
		int year = scan.nextInt();
		int month = scan.nextInt();
		int days = 0;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if(year%4==0&&year%100!=0||year%400==0){
				days = 29;
			}else{
				days = 28;
			}
		}
		System.out.println(days);
	}
	
	@Test
	public void test7(){
		//学生成绩等级输出
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入该学生的分数（0-100）：");
		double score = scanner.nextDouble();
		if(score<0||score>100){
			System.out.println("请输入0到100以内的分数");
		}else if(score>=90){
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=60){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
		
		
	}
		
}


