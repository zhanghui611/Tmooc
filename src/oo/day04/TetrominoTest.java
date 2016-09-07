package oo.day04;

//图形测试类
public class TetrominoTest {
	public static void main(String[] args) {
		T t = new T();
		t.print();
		
		J j = new J();
		j.print();
	}
	public static void printCell(Tetromino tt){
		for(int i=0;i<20;i++){//行
			for(int j=0;j<10;j++){//列
				boolean flag = true;//默认打-
				for(int k=0;k<4;k++){//格
					if(i==tt.cells[k].row&&j==tt.cells[k].col){
						flag = false;
						System.out.print("* ");
						break;
					}
				}
				if(flag){
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
class Tetromino{//父类--图形类
	Cell[] cells;
	Tetromino(){
		cells = new Cell[4];
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

class T extends Tetromino{
	T(){
		this(0, 0);//调本类构造方法
	}
	T(int row,int col){
		super();//自己不写则默认添加
				//调父类的构造方法
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row,col+1);
		cells[2] = new Cell(row,col+2);
		cells[3] = new Cell(row+1,col+1);
	}

	void print(){
		System.out.println("i am a T");
		super.print();//调用父类的print()方法
	}
}

class J extends Tetromino{
	J(){
		this(0,0);
	}
	J(int row,int col){
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row,col+1);
		cells[2] = new Cell(row,col+2);
		cells[3] = new Cell(row+1,col+2);
	}
	
	void print(){
		System.out.println("i am a J");
		super.print();//调用父类的print()方法
	}
}