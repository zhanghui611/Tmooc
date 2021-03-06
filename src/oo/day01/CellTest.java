package oo.day01;

public class CellTest {
	public static void main(String[] args) {
		/*//创建格子对象
		Cell cell = new Cell();
		//访问成员变量
		cell.row = 4;//行号为4
		cell.col = 5;//列号为5
		//调用方法
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
		print(c);//相当于Cell cc = c
		
		System.out.println("下落一行");
		c.drop();
		print(c);
		
		System.out.println("左移两列");
		c.moveLeft(2);
		print(c);
	}
	/**
	 * 放在Cell类里可以但是不合适
	 * 下面的行为是打墙+打格，格子这个对象没有这些行为，不合理
	 * @param cc
	 */
	public static void print(Cell cc){
		for(int i=1;i<=20;i++){//行号
			for(int j=1;j<=10;j++){//列号
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
