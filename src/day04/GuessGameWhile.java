package day04;
import java.util.Scanner;
public class GuessGameWhile {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		System.out.println("����������1-1000���˳��밴0��");
		Scanner scan = new Scanner(System.in);
		int guess = scan.nextInt();  //Ҫ��1
		
		while(guess!=num){  //Ҫ��2
			if(guess==0){
				break;  //��ֹѭ��������ѭ��
			}else if(guess>num){
				System.out.println("̫����");
			}else{
				System.out.println("̫С��");
			}
		System.out.println("������1-1000���˳��밴0��");
		guess = scan.nextInt();//Ҫ��3
		}
		if(guess==num){
			System.out.println("��ϲ�����¶���");
		}else{
			System.out.println("���ź����´�����");
		}
		scan.close();
	}

}
