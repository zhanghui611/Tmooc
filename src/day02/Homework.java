package day02;

import java.util.Scanner;

import org.junit.Test;

public class Homework {
	
	@Test
	public void test1(){
		int count = 30;
		count = 60;
		System.out.println(count);//60
		
		char ascii = 98;
		System.out.println(ascii);//b
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 +b2);//byte参与运算时是int类型，需要强转
		System.out.println(b3);
	}
	
	@Test
	public void test2(){
		double width = 6.0;
		double length = 4.9;
		System.out.println(width-length);//1.0999999999999996
	}
	
	@Test
	public void test3(){
		int a = 1,b = 10;
		int c1 = a++;//c1 = 1 ;a = 2
		int c2 = ++b;//c2 = 11;b = 11
		System.out.println(c1+","+c2);
	}
	
	@Test
	public void test4(){
		int i =100,j = 200;
		boolean b1 =(i>j)&&(i++>100);
		System.out.println(b1);//false
		System.out.println(i);//100
	}
	
	@Test
	public void test5(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入单价（￥）：");
		double price = scanner.nextDouble();
		System.out.println("请输入数量：");
		double quantity = scanner.nextDouble();
		System.out.println("请输入金额（￥）：");
		double money = scanner.nextDouble();
		
		double totalPrice = price*quantity;
		if(totalPrice>=500){
			totalPrice *= 0.8;
		}
		if(money>=totalPrice){
			double change = money - totalPrice;
			System.out.println("应收金额为：￥"+totalPrice+",找零为：￥"+change);
		}else{
			System.out.println("输入信息有误！");
		}
	}
	
	
}
