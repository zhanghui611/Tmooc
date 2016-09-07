package oo.day06;
/**
 * 内部类：
 * 1.内部类只为外部类来使用，其他类不用
 * 2.内部类可以直接访问外部类的所有成员
 * 		默认有个隐式的指向外部类对象的Mama.this
 * 3.内部类通常只在外部类中被创建(new)
 *
 */
public class Mama {	//外部类
	String name;
	Mama(String name){
		this.name = name;
	}
	Baby create(){	//创建Baby对象
		return new Baby();
	}
	class Baby{		//内部类
		void mamaName(){
			//默认的隐式的Mama.this
			System.out.println(name);
			//完整写法Mama.this指代当前外部类对象
			System.out.println(Mama.this.name);
		}
	}
}
