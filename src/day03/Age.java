package day03;
import java.util.Scanner;//1

//�����û���������䣬�ж��Ƿ���18-50֮��
public class Age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//2
		
		System.out.println("��������������");
		int age = scan.nextInt();//3
		boolean b = age>=18 && age<=50;
		System.out.println(b);
		scan.close();//4 ���п���
	}

}
