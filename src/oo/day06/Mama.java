package oo.day06;
/**
 * �ڲ��ࣺ
 * 1.�ڲ���ֻΪ�ⲿ����ʹ�ã������಻��
 * 2.�ڲ������ֱ�ӷ����ⲿ������г�Ա
 * 		Ĭ���и���ʽ��ָ���ⲿ������Mama.this
 * 3.�ڲ���ͨ��ֻ���ⲿ���б�����(new)
 *
 */
public class Mama {	//�ⲿ��
	String name;
	Mama(String name){
		this.name = name;
	}
	Baby create(){	//����Baby����
		return new Baby();
	}
	class Baby{		//�ڲ���
		void mamaName(){
			//Ĭ�ϵ���ʽ��Mama.this
			System.out.println(name);
			//����д��Mama.thisָ����ǰ�ⲿ�����
			System.out.println(Mama.this.name);
		}
	}
}
