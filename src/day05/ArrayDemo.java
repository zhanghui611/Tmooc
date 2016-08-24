package day05;

import org.junit.Test;

public class ArrayDemo {
	@Test
	public void test1(){
		int[] arr = new int[4];
		System.out.println(arr[0]);//0 int的默认值是0
		
		int[] a;
		//System.out.println(a[2]);
		//错误，未初始化
		
		int[] b;
		b = new int[4];//先声明再初始化
		
		int[] c = new int[4];//声明同时初始化
		
		int[] d = {1,2,3,4};//声明同时初始化
		
		int[] e = new int[]{1,2,3,4};//声明同时初始化
	}
	
	@Test
	public void test2(){
		//循环给每一个元素赋值0-99
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println("数组元素如下：");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("倒着输出");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		
	}
	
	@Test
	public void test3(){
		int[] a = new int[4];
		System.out.println(a[2]);//0
		
		int[] b = new int[]{1,4,6};
		
		int[] c = {1,4,6};
		
		double[] d = new double[3];
		d[1] = 55.5;
		System.out.println(d[2]);//0.0
		
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("数组的元素如下：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
			
		}
	}
}
