package day03;
import java.util.Scanner;
import org.junit.Test;

public class Again {
	@Test
	public void test1(){
		//�ж��Ƿ�������
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ����磺2012��");
		int year = scanner.nextInt();
		if(year%400==0||year%4==0&&year%100!=0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
	}
	
	@Test
	public void test2(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ����磺2012��");
		int year = scanner.nextInt();
		boolean isYear = (year%4==0&&year%100!=0)||year%400==0;
		String msg = isYear?year+"������":year+"��������";
		System.out.println(msg);
	}
}
