package day03;
import java.util.Scanner;
//����̨����
public class Cashier {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����뵥�ۣ�");
		double unitPrice = scan.nextDouble();
		System.out.println("������������");
		double quantity = scan.nextDouble();
		System.out.println("�������");
		double money = scan.nextDouble();
		
		//Ӧ�ս��
		double totalPrice = unitPrice * quantity;
		
		if(totalPrice>=500){  //��500����� 
			totalPrice *= 0.8;
		}
		
		if(money>=totalPrice){
			//����
			double change = money - totalPrice;
			System.out.println("Ӧ�ս�"+totalPrice+",����"+change);	
		}else{
			System.out.println("Error��Ǯ������");
		}
		
		
	}

}
