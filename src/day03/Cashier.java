package day03;
import java.util.Scanner;
//收银台程序
public class Cashier {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入单价：");
		double unitPrice = scan.nextDouble();
		System.out.println("请输入数量：");
		double quantity = scan.nextDouble();
		System.out.println("请输入金额：");
		double money = scan.nextDouble();
		
		//应收金额
		double totalPrice = unitPrice * quantity;
		
		if(totalPrice>=500){  //满500打八折 
			totalPrice *= 0.8;
		}
		
		if(money>=totalPrice){
			//找零
			double change = money - totalPrice;
			System.out.println("应收金额："+totalPrice+",找零"+change);	
		}else{
			System.out.println("Error！钱不够了");
		}
		
		
	}

}
