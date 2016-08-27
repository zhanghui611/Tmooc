package oo.day02;
//数组的数组演示
public class ArrayDemo {
	public static void main(String[] args) {
		
		/*Cell[] cells = new Cell[4];
		cells[0]=new Cell();
		cells[1]=new Cell(2,3);
		cells[2]=new Cell(3,4);
		cells[3]=new Cell(5,4);
		System.out.println(cells[2].row);//3*/
		
		/*Cell[] cells={
			new Cell(),
			new Cell(2,3),
			new Cell(3,4),
			new Cell(5,4)
		};*/
		
		int[][] arr = new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[4];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
			}
		}
		arr[1][0]=100;
		System.out.println(arr[1][0]);
		
		
		//3行4列---简写
		int[][] arr1 = new int[3][4];
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				arr1[i][j]=100;
			}
		}
		
	}

}
