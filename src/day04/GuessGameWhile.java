package day04;
import java.util.Scanner;
public class GuessGameWhile {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		System.out.println("请输入数字1-1000，退出请按0：");
		Scanner scan = new Scanner(System.in);
		int guess = scan.nextInt();  //要素1
		
		while(guess!=num){  //要素2
			if(guess==0){
				break;  //终止循环，跳出循环
			}else if(guess>num){
				System.out.println("太大了");
			}else{
				System.out.println("太小了");
			}
		System.out.println("请输入1-1000，退出请按0：");
		guess = scan.nextInt();//要素3
		}
		if(guess==num){
			System.out.println("恭喜，您猜对了");
		}else{
			System.out.println("真遗憾，下次再来");
		}
		scan.close();
	}

}
