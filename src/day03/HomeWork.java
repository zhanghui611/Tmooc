package day03;
import java.util.Scanner;

import org.junit.Test;
public class HomeWork {
	@Test
	public void test1(){
		//���������������ֵ
		Scanner scan = new Scanner(System.in);
		System.out.println("������������a,b");
		int a =scan.nextInt();
		int b = scan.nextInt();
		
		int max = a>b?a:b;
		System.out.println("max="+max);
	}
	
	@Test
	public void test2(){
		//���������������ֵ
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������a,b,c");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = 0;
		if(a>max){
			max = a;
		}
		if(b>max){
			max = b;
		}
		if(c>max){
			max = c;
		}
		System.out.println("max="+max);
	}
	
	@Test
	public void text3(){
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������a,b,c");
		int array1[] = new int[3];//���������
		//int[] array2 = new int[3];//���������
		//int[] array3 = new int[]{1,2,3};//����������Լ���ʼ��
		int max = 0;
		int num = 0;
		for(int i=0;i<array1.length;i++){
			num = scan.nextInt();
			array1[i] = num;
		}
		for(int i=0;i<array1.length;i++){
			if(array1[i]>max){
				max = array1[i];
			}
		}
		System.out.println("max="+max);
	}
	
	@Test
	public void text4(){
		//��д������ֵ���������
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������a,b,c");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a>b){
			int t = a;
			a = b;
			b = t;
		}
		if(a>c){
			int t = a;
			a = c;
			c = t;
		}
		if(b>c){
			int t = b;
			b = c;
			c = t;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	
	@Test
	public void text5(){
		//��������˰
		Scanner scan = new Scanner(System.in);
		System.out.println("���������Ĺ���");
		double salary = scan.nextDouble();
		double tarSalary = salary - 3500;
		double tax=0;
		if(tarSalary<1500){
			tax = tarSalary*0.03-0;
		}else if(tarSalary<=4500){
			tax = tarSalary*0.1-105;
		}else if(tarSalary<=9000){
			tax = tarSalary*0.2-555;
		}
		System.out.println("˰��"+tax);
	}
	
	@Test
	public void text6(){
		//������ݺ��·ݣ�������µ�������switch-case��
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ��·�");
		int year = scan.nextInt();
		int month = scan.nextInt();
		int days = 0;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if(year%4==0&&year%100!=0||year%400==0){
				days = 29;
			}else{
				days = 28;
			}
		}
		System.out.println(days);
	}
	
	@Test
	public void test7(){
		//ѧ���ɼ��ȼ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ѧ���ķ�����0-100����");
		double score = scanner.nextDouble();
		if(score<0||score>100){
			System.out.println("������0��100���ڵķ���");
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


