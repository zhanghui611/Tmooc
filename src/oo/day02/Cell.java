package oo.day02;
//格子类
public class Cell {
	int row; //行号
	int col; //列号
	
	Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	Cell(int n){
		//this(n,n);//调用构造方法
		this.row = n;
		this.col = n;
	}
	Cell(){
		//this(0,0);//调用构造方法
	}
	
	public void drop(){ //下落1格
		row++;
	}
	public void drop(int n){//下落n格
		row += n;
	}
	public void moveLeft(){//左移1格
		col --;
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
