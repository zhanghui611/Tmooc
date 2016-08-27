package oo.day02;
//������
public class Cell {
	int row; //�к�
	int col; //�к�
	
	Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	Cell(int n){
		//this(n,n);//���ù��췽��
		this.row = n;
		this.col = n;
	}
	Cell(){
		//this(0,0);//���ù��췽��
	}
	
	public void drop(){ //����1��
		row++;
	}
	public void drop(int n){//����n��
		row += n;
	}
	public void moveLeft(){//����1��
		col --;
	}
	public void moveLeft(int n){//����n��
		col -= n;
	}
	public void moveRight(int m){//����m��
		col += m;
	}
	public String getCellInfo(){//��ȡ��������
		return row+",,,"+col;
	}
}
