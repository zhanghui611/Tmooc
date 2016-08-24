package day05;
import java.util.Arrays;
//数组最大值
public class MaxOfArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		//循环赋值
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		//循环输出值
		System.out.println("数组中的元素如下：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//查询最大值
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("最大值是："+max);
		
		//扩容
		arr = Arrays.copyOf(arr, arr.length+1);
		//将max赋值给最后一个元素
		arr[arr.length-1] = max;
		
		System.out.println("新数组中的数据为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
