package day04;
import java.util.Scanner;
public class GuessGameDoWhile {
	public static void main(String[] args) {
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guess;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("����������1-1000���˳��밴0��");
			guess = scan.nextInt();
			if(guess==0){
				break;  //��ֹѭ��������ѭ��
			}else if(guess>num){
				System.out.println("̫����");
			}else if(guess<num){
				System.out.println("̫С��");
			}
		}while(guess != num);
		if(guess==num){
			System.out.println("��ϲ�����¶���");
		}else{
			System.out.println("���ź����´�����");
		}
	}

}
