package oo.day05;
//�ӿ���ʾ
public class InterfaceDemo {
	public static void main(String[] args) {
		//���󣬽ӿڲ��ܱ�ʵ����
		//IInter i = new IInter();
		
		IInter1 i = new Goo();//��������
		i.a(); //Goo��a����
		i.b(); //Goo��b����
		//i.show();���󣬵����ʲô��������
	}
}
interface IInter1{
	void a();
	void b();
}
class Goo implements IInter1{
	void show(){}
	public void a(){}
	public void b(){}
}
interface IInter2{
	void c();
}
interface IInter3 extends IInter1{
	void m();
}
class Foo implements IInter3{
	public void a(){}
	public void b(){}
	public void m(){}
}
abstract class Coo{
	abstract void d();
}
class Doo extends Coo implements IInter1,IInter2{
	public void a(){}
	public void b(){}
	public void c(){}
	void d(){}
}
class Boo implements IInter1,IInter2{
	public void a(){}
	public void b(){}
	public void c(){}
}

class Aoo implements IInter1{
	public void a(){}
	public void b(){}
}

interface IInter{
	//�ӿ���ֻ�ܰ��������ͳ��󷽷�
	public static final double PI = 3.14159;
	int NUM = 5;//Ĭ��public static final
	
	public abstract void show();
	void say();//Ĭ��public abstract
	
	//int NUM2;//���󣬳�����������ͬʱ��ʼ��
	//void sayHi(){}//���󣬲��ܰ�����ͨ����
}