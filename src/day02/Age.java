package day02;
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������䣺");
		int age = scanner.nextInt();
		if(age>=18&&age<=50){
			System.out.println("���������ǣ�"+age);
		}else{
			System.out.println("�������䲻�ڷ�Χ�ڣ�");
		}
	}

}
