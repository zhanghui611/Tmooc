package oo.day04;

//ͼ�β�����
public class TetrominoTest {
	public static void main(String[] args) {
		T t = new T();
		t.print();
		
		J j = new J();
		j.print();
	}
	public static void printCell(Tetromino tt){
		for(int i=0;i<20;i++){//��
			for(int j=0;j<10;j++){//��
				boolean flag = true;//Ĭ�ϴ�-
				for(int k=0;k<4;k++){//��
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
class Tetromino{//����--ͼ����
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
	void print(){//��ӡÿ�����ӵ�����
		for(int i=0;i<cells.length;i++){
			String s = cells[i].getCellInfo();
			System.out.println(s);
		}
	}
}

class T extends Tetromino{
	T(){
		this(0, 0);//�����๹�췽��
	}
	T(int row,int col){
		super();//�Լ���д��Ĭ�����
				//������Ĺ��췽��
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row,col+1);
		cells[2] = new Cell(row,col+2);
		cells[3] = new Cell(row+1,col+1);
	}

	void print(){
		System.out.println("i am a T");
		super.print();//���ø����print()����
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
		super.print();//���ø����print()����
	}
}