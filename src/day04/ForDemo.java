package day04;

public class ForDemo {

	public static void main(String[] args) {
		/*
		for(int count = 1;count<=3;count++){
			System.out.println("run");
		}
		
		for(int num = 1;num<=10;num++){
			System.out.println("fighting");
		}
		
		for(int num=1;num<=9;num++){
			System.out.println(num+"*9="+num*9);
		}
		*/
		
		/*int sum =0;
		for(int i =1;i<=100;i++){
			sum += i;
		}
		System.out.println("��1�ӵ�100�ĺͣ�"+sum);*/
		
		//break:����ѭ��
		for(int i=1;i<=10;i++){
			if(i==4){
				break;//��ֹ
			}
			System.out.println(i);//1,2,3
		}
		
		//continue:����ѭ������ʣ����䣬��������һ��ѭ��
		for(int i=1;i<=10;i++){
			if(i%3==0){
				continue;//ֱ��ȥ��i++
			}
			System.out.println(i);//1,2,4,5,7,8,10
		}
		
		//���飬�������˵�˼ά
		for(int i=1;i<=10;i++){
			if(i%3!=0){
				System.out.println(i);//1,2,4,5,7,8,10
			}
		}
	}

}
