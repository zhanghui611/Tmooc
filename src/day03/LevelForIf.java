package day03;
import java.util.Scanner;
public class LevelForIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɼ�");
		int score = scan.nextInt();
		
		if(score<0||score>100){
			System.out.println("�ɼ����Ϸ�");
		}else if(score>=90){
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=60){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
	}

}
