package oo.day01;
//������
public class Cell {
	int row; //�к�
	int col; //�к�
	
	public void drop(){ //����1��
		row++;
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
