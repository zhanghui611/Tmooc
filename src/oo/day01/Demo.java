package oo.day01;

public class Demo {
	public static void main(String[] args) {
		/*Cell c = new Cell();
		c.row = 5;
		c.col = 6;
		
		Cell cc = c;//��������֮�仮�Ⱥ�
					//���壺ָ��ͬһ������
		
		cc.row = 8;
		System.out.println(c.row);//8
		
		Cell ccc = new Cell();
		ccc.row =10;
		System.out.println(c.row);//8*/
		
		Cell c = new Cell();
		c.row = 5;
		System.out.println(c.row);//5
		
		c = null;//����ָ�����
		c.row = 8;//��ָ���쳣����Ϊ��nullȥ�����
		
	}

}
