package day05;
import java.util.Arrays;
import java.util.Random;  //1.
import org.junit.Test;

//��������
public class ArraySortDemo {
	
	@Test
	public void test1(){
		int[] arr = {7,1,55,22,42};
		//Ч�����---����ʹ��
		Arrays.sort(arr);//��arr���������������
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	@Test
	public void test2(){
		Random random = new Random();  //2.
		//ð������
		int[] arr = new int[100];
		//�������е�Ԫ�ظ�ֵ
		for(int i=0;i<arr.length;i++){
			//arr[i] = (int)(Math.random()*100+1); //3.
			arr[i] = random.nextInt(100);
		}
		//ð��
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		//���
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		/**
		 * 99,25,45,2,23---����
		 * ��һ�֣�
		 * 		99��25�Ƚϣ���    25,99,45,2,23
		 * 		99��45�Ƚϣ���    25,45,99,2,23
		 * 		99��2�Ƚϣ���      25,45,2,99,23
		 * 		99��23�Ƚϣ���    25,45,2,23,99----ð����99
		 * �ڶ��֣�
		 * 		25��45�Ƚϣ�����
		 * 		45��2�Ƚϣ���       25,2,45,23,99
		 * 		45��23�Ƚϣ���     25,2,23,45,99----ð����45
		 * �����֣�
		 * 		25��2�Ƚϣ���       2,25,23,45,99
		 * 		25��23�Ƚϣ���     2,23,25,45,99----ð����25
		 * �����֣�
		 * 		2��23�Ƚϣ�����-------------------ð����23
		 * 
		 * ������
		 * 1).5������Ҫð4��
		 * 	for(int i=0;i<arr.length-1;i++){}
		 * 2).ÿһ�ֱȶ��ٴ�
		 * 	for(int j=0;i<arr.length-1-i;j++){}
		 * 
		 * 	for(int i=0;i<arr.length-1;i++){//������
		 * 		for(int j=0;i<arr.length-1-i;j++){//���ƱȽϼ���
		 * 			if(arr[j]>arr[j+1]){
		 * 				int t= arr[j];
		 * 				arr[j]=arr[j+1];
		 * 				arr[j+1]=t
		 * 			}
		 * 		}
		 * 	}
		 * 
		 * 		   4-i  (arr.length-1)-i
		 *   i=0   �Ƚ�4��
		 *   i=1   �Ƚ�3��
		 *   i=2   �Ƚ�2��
		 *   i=3   �Ƚ�1��
		 */
	}
	
	
}
