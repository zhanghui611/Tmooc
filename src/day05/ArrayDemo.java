package day05;

import org.junit.Test;

public class ArrayDemo {
	@Test
	public void test1(){
		int[] arr = new int[4];
		System.out.println(arr[0]);//0 int��Ĭ��ֵ��0
		
		int[] a;
		//System.out.println(a[2]);
		//����δ��ʼ��
		
		int[] b;
		b = new int[4];//�������ٳ�ʼ��
		
		int[] c = new int[4];//����ͬʱ��ʼ��
		
		int[] d = {1,2,3,4};//����ͬʱ��ʼ��
		
		int[] e = new int[]{1,2,3,4};//����ͬʱ��ʼ��
	}
	
	@Test
	public void test2(){
		//ѭ����ÿһ��Ԫ�ظ�ֵ0-99
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println("����Ԫ�����£�");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("�������");
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
		System.out.println("�����Ԫ�����£�");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
			
		}
	}
}
