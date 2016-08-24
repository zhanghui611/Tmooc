package day05;
import java.util.Arrays;
import org.junit.Test;

public class ArrayCopyDemo {
	@Test
	public void test1(){
		//System.arraycopy();
		int[] a = {10,20,30,40,50};//源数组
		int[] a1 = new int[6];//目标数组
		System.arraycopy(a, 0, a1, 1, 4);
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+" ");
		}	
	}
	
	@Test
	public void test2(){
		
		int[] a ={10,20,30,40,50};
		int[] b = Arrays.copyOf(a, 6);
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		//数组的扩容
		a = Arrays.copyOf(a, a.length+1);
	}
}


