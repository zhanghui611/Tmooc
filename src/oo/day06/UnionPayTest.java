package oo.day06;

public class UnionPayTest {

	public static void main(String[] args) {
		//�������ж���
		/*ICBCImpl icbc = new ICBCImpl();
		ICBC icbc1 = new ICBCImpl();
		UnionPay icbc2 = new ICBCImpl();*/
		
		ABCATM atm = new ABCATM();//atm������
		UnionPay card = new ABCImpl();//ũ�п�
		//UnionPay card = new ICBCImpl();//���п�
		atm.insertCard(card);//�忨
		atm.payPhone();
	}
}
class ABCATM{	//ũ��ATM
	UnionPay card;	//������
	void insertCard(UnionPay card){	//�忨
		this.card = card;
	}
	void payPhone(){	//֧���绰��
		//�ж��Ƿ���ũ�п�
		if(card instanceof ABCImpl){
			ABCImpl abc = (ABCImpl)card;
			abc.֧���绰��();
		}else{
			System.out.println("�����Ͳ���");
		}
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
	public void ֧���绰��(){
		System.out.println("֧�����ѳɹ�");
	};
}











