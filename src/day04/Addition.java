package day04;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

//����ӷ�������
public class Addition {
	public static void main(String[] args) {
		System.out.println("����ʼ10�μӷ�����...");
		Scanner scan = new Scanner(System.in);
		int score = 0;
		for(int i=1;i<=10;i++){
			//���������������
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int result = a+b;//Ԥ����ȷ��
			System.out.println("("+i+"). "+a+"+"+b+" = ?");
			System.out.println("������𰸣�����-1�˳���");
			int answer = scan.nextInt();
			if(answer==-1){
				break;
			}else if(answer==result){
				System.out.println("Correct!");
				score +=10;
			}else{
				System.out.println("Error!");
			}
		}
		System.out.println("�˴β����������ķ����ǣ�"+score);
	}

}
