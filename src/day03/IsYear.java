package day03;
import java.util.Scanner;
public class IsYear {

	public static void main(String[] args) {
	//�����жϳ���
	//����1���ܱ�4�������ǲ��ܱ�100����
		//year%4==0 year%100!=0
	//����2�������ܱ�400����
		//year%400==0
	Scanner scan = new Scanner(System.in);
	
	System.out.println("���������");
	int year = scan.nextInt();
	scan.close();
	
	boolean b = year%4==0 && year%100!=0
			 	|| year%400==0;
	
	String str = b? year +"������" : year+"��������";
	System.out.println(str);
	
	}

}
