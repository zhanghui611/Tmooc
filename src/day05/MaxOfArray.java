package day05;
import java.util.Arrays;
//�������ֵ
public class MaxOfArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		//ѭ����ֵ
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		//ѭ�����ֵ
		System.out.println("�����е�Ԫ�����£�");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//��ѯ���ֵ
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("���ֵ�ǣ�"+max);
		
		//����
		arr = Arrays.copyOf(arr, arr.length+1);
		//��max��ֵ�����һ��Ԫ��
		arr[arr.length-1] = max;
		
		System.out.println("�������е�����Ϊ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
