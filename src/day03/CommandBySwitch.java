package day03;
import java.util.Scanner;
//�����������
public class CommandBySwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����빦�ܣ�0,1,2");
		int command = scan.nextInt();
		
		switch(command){
		case 1:
			System.out.println("��ʾȫ����¼");
			break;
		case 2:
			System.out.println("��ѯ��¼��¼");
			break;
		case 0:
			System.out.println("��ӭʹ��");
			break;
		default:
			System.out.println("�������");
		}
	}

}
