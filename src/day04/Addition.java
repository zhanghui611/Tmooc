package day04;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

//随机加法运算器
public class Addition {
	public static void main(String[] args) {
		System.out.println("将开始10次加法测试...");
		Scanner scan = new Scanner(System.in);
		int score = 0;
		for(int i=1;i<=10;i++){
			//随机生成两个数字
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int result = a+b;//预存正确答案
			System.out.println("("+i+"). "+a+"+"+b+" = ?");
			System.out.println("请输入答案（输入-1退出）");
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
		System.out.println("此次测验结束，你的分数是："+score);
	}

}
