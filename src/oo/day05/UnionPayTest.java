package oo.day05;

public class UnionPayTest {

	public static void main(String[] args) {
		//�������ж���
		ICBCImpl icbc = new ICBCImpl();
		ICBC icbc1 = new ICBCImpl();
		UnionPay icbc2 = new ICBCImpl();
	}
}
interface UnionPay{	//�����ӿ�
	void ��Ǯ();
	void ȡǮ();
	void ������();
	void �����();
}
interface ICBC extends UnionPay{  //���нӿ�
	void ����֧��();
}
interface ABC extends UnionPay{	//ũ�нӿ�
	void ֧���绰��();
}
class ICBCImpl implements ICBC{//����ʵ����
	public void ��Ǯ(){};
	public void ȡǮ(){};
	public void ������(){};
	public void �����(){};
	public void ����֧��(){};
}
class ABCImpl implements ABC{//ũ��ʵ����
	public void ��Ǯ(){};
	public void ȡǮ(){};
	public void ������(){};
	public void �����(){};
	public void ֧���绰��(){};
}











