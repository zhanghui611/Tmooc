package oo.day01;

public class Demo {
	public static void main(String[] args) {
		/*Cell c = new Cell();
		c.row = 5;
		c.col = 6;
		
		Cell cc = c;//引用类型之间划等号
					//意义：指向同一个对象
		
		cc.row = 8;
		System.out.println(c.row);//8
		
		Cell ccc = new Cell();
		ccc.row =10;
		System.out.println(c.row);//8*/
		
		Cell c = new Cell();
		c.row = 5;
		System.out.println(c.row);//5
		
		c = null;//不再指向对象
		c.row = 8;//空指针异常，因为用null去点操作
		
	}

}
