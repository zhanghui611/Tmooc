package day05;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.Test;

public class Homework {
	@Test
	public void test1(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������������ķ�Χ��2~");
		int num = scanner.nextInt();
		int count = 0;//������
		for(int n=2;n<=num;n++){
			boolean flag = true;
			for(int i=2;i<=Math.sqrt(n);i++){//�ж�ƽ�����Ѿ��㹻��,����ѭ������
				if(n%i==0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.print(n+" ");
				count++;//������1
				if(count%10==0){//ÿʮ����һ��
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("��"+count+"������");
		
		/**
		 * ������
		 * 8
		 * 	8% 2/3/4/5/6/7
		 * 	ֻҪ��һ��Ϊ0��˵����������
		 * 5
		 * 	5% 2/3/4
		 * 	���ж���Ϊ0��˵��������
		 * ���أ�
		 * int n = 8;
		 * boolean flag = true;//����ÿһ������������
		 * for(int i=2;i<n;i++){
		 * 		if(n%i==0){
		 * 		��������
		 * 		flag = false;//��������
		 * 		break;
		 * 		}
		 * }
		 * if(flag==true){
		 * 		������
		 * }
		 * Git Comment Test
		 */
	
	}
	@Test
	public void test2(){
		/**
		 * int[]��һ������������
		 * ���������ͣ��ǻ�������
		 */
	}
	
	@Test
	public void test3(){
		int[] a =new int[4];
		int[] b;
		b = new int[4];
		int[] c = {1,2,3,4};
		int[] d = new int[]{1,2,3,4};
	}
	
	@Test
	public void test4(){
		//��ѯ�����е���Сֵ�������������ݳ��µ�����,��Сֵ���ڵ�һλ
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		//����ĸ�ֵ
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		//��������
		System.out.print("�����е�����Ϊ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//��ѯ��Сֵ
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("min="+min);
		//����
		arr = Arrays.copyOf(arr, arr.length+1);
		//ƽ��
		for(int i=arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = min;
		//����µ�����
		System.out.print("�������е�����Ϊ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
