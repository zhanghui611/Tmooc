package oo.day05;
//����������
public class ShapeTest {
	public static void main(String[] args) {
		//Shape shape = new Shape();
		//���󣬳����಻�ܱ�ʵ����
		
		//new Shape����
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(1);
		shapes[1] = new Square(1);
		maxArea(shapes);
	}
	public static void maxArea(Shape[] shapes){
		double maxArea = shapes[0].area();
		int maxIndex = 0;//����������
		for(int i=1;i<shapes.length;i++){
			double area = shapes[i].area();
			if(area>maxArea){
				maxArea = area;//����������
				maxIndex = i;  //��������������
			}
		}
		System.out.println("maxArea="+maxArea);
	}
}
abstract class Shape{
	double c;
	abstract double area();
}
class Circle extends Shape{
	Circle(double c){
		this.c = c;
	}
	double area(){
		return 0.0796*c*c;
	}
}
class Square extends Shape{
	Square(double c){
		this.c = c;
	}
	double area(){
		return 0.0625*c*c;
	}
}













