package oo.day02;
//T型
public class T {
	Cell[] cells;
	
	T(){
		this(0, 0);
	}
	T(int row,int col){
		cells = new Cell[4];
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row,col+1);
		cells[2] = new Cell(row,col+2);
		cells[3] = new Cell(row+1,col+1);
	}
	
	void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	void print(){//打印每个格子的坐标
		for(int i=0;i<cells.length;i++){
			String s = cells[i].getCellInfo();
			System.out.println(s);
		}
	}
}
