package oo.day01;

public class CellTest {
	public static void main(String[] args) {
		/*//�������Ӷ���
		Cell cell = new Cell();
		//���ʳ�Ա����
		cell.row = 4;//�к�Ϊ4
		cell.col = 5;//�к�Ϊ5
		//���÷���
		cell.drop();
		cell.moveLeft(3);
		String s = cell.getCellInfo();
		System.out.println(s);//5,,,2
		
		Cell c = new Cell();
		String ss = c.getCellInfo();
		System.out.println(ss);//0,,,0*/
		
		Cell c = new Cell();
		c.row = 5;
		c.col = 4;
		print(c);//�൱��Cell cc = c
		
		System.out.println("����һ��");
		c.drop();
		print(c);
		
		System.out.println("��������");
		c.moveLeft(2);
		print(c);
	}
	/**
	 * ����Cell������Ե��ǲ�����
	 * �������Ϊ�Ǵ�ǽ+��񣬸����������û����Щ��Ϊ��������
	 * @param cc
	 */
	public static void print(Cell cc){
		for(int i=1;i<=20;i++){//�к�
			for(int j=1;j<=10;j++){//�к�
				if(cc.row==i&&cc.col==j){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
