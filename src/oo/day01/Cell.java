package oo.day01;
//格子类
public class Cell {
	int row; //行号
	int col; //列号
	
	public void drop(){ //下落1行
		row++;
	}
	public void moveLeft(int n){//左移n格
		col -= n;
	}
	public void moveRight(int m){//右移m格
		col += m;
	}
	public String getCellInfo(){//获取格子坐标
		return row+",,,"+col;
	}
}
