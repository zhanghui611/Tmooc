package day05;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.Test;

public class Homework {
	@Test
	public void test1(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入查找质数的范围：2~");
		int num = scanner.nextInt();
		int count = 0;//计数器
		for(int n=2;n<=num;n++){
			boolean flag = true;
			for(int i=2;i<=Math.sqrt(n);i++){//判断平方根已经足够了,减少循环次数
				if(n%i==0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.print(n+" ");
				count++;//计数增1
				if(count%10==0){//每十个换一行
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("共"+count+"个质数");
		
		/**
		 * 求质数
		 * 8
		 * 	8% 2/3/4/5/6/7
		 * 	只要有一个为0，说明不是质数
		 * 5
		 * 	5% 2/3/4
		 * 	所有都不为0，说明是质数
		 * 开关：
		 * int n = 8;
		 * boolean flag = true;//假设每一个数都是质数
		 * for(int i=2;i<n;i++){
		 * 		if(n%i==0){
		 * 		不是质数
		 * 		flag = false;//不是质数
		 * 		break;
		 * 		}
		 * }
		 * if(flag==true){
		 * 		是质数
		 * }
		 * Git Comment Test
		 */
	
	}
	@Test
	public void test2(){
		/**
		 * int[]是一种数据类型吗？
		 * 是数据类型，非基本类型
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
		//查询数组中的最小值，并将数组扩容成新的数组,最小值放在第一位
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		//数组的赋值
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		//数组的输出
		System.out.print("数组中的数据为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//查询最小值
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("min="+min);
		//扩容
		arr = Arrays.copyOf(arr, arr.length+1);
		//平移
		for(int i=arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = min;
		//输出新的数组
		System.out.print("新数组中的数据为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
