package day05;
import java.util.Arrays;
import java.util.Random;  //1.
import org.junit.Test;

//数组排序
public class ArraySortDemo {
	
	@Test
	public void test1(){
		int[] arr = {7,1,55,22,42};
		//效率最高---建议使用
		Arrays.sort(arr);//对arr数组进行升序排序
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	@Test
	public void test2(){
		Random random = new Random();  //2.
		//冒泡排序
		int[] arr = new int[100];
		//给数组中的元素赋值
		for(int i=0;i<arr.length;i++){
			//arr[i] = (int)(Math.random()*100+1); //3.
			arr[i] = random.nextInt(100);
		}
		//冒泡
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		//输出
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		/**
		 * 99,25,45,2,23---升序
		 * 第一轮：
		 * 		99和25比较，换    25,99,45,2,23
		 * 		99和45比较，换    25,45,99,2,23
		 * 		99和2比较，换      25,45,2,99,23
		 * 		99和23比较，换    25,45,2,23,99----冒出了99
		 * 第二轮：
		 * 		25和45比较，不换
		 * 		45和2比较，换       25,2,45,23,99
		 * 		45和23比较，换     25,2,23,45,99----冒出了45
		 * 第三轮：
		 * 		25和2比较，换       2,25,23,45,99
		 * 		25和23比较，换     2,23,25,45,99----冒出了25
		 * 第四轮：
		 * 		2和23比较，不换-------------------冒出了23
		 * 
		 * 分析：
		 * 1).5个数需要冒4轮
		 * 	for(int i=0;i<arr.length-1;i++){}
		 * 2).每一轮比多少次
		 * 	for(int j=0;i<arr.length-1-i;j++){}
		 * 
		 * 	for(int i=0;i<arr.length-1;i++){//控制轮
		 * 		for(int j=0;i<arr.length-1-i;j++){//控制比较几次
		 * 			if(arr[j]>arr[j+1]){
		 * 				int t= arr[j];
		 * 				arr[j]=arr[j+1];
		 * 				arr[j+1]=t
		 * 			}
		 * 		}
		 * 	}
		 * 
		 * 		   4-i  (arr.length-1)-i
		 *   i=0   比较4次
		 *   i=1   比较3次
		 *   i=2   比较2次
		 *   i=3   比较1次
		 */
	}
	
	
}
