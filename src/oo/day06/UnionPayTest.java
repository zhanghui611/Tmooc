package oo.day06;

public class UnionPayTest {

	public static void main(String[] args) {
		//创建工行对象
		/*ICBCImpl icbc = new ICBCImpl();
		ICBC icbc1 = new ICBCImpl();
		UnionPay icbc2 = new ICBCImpl();*/
		
		ABCATM atm = new ABCATM();//atm机对象
		UnionPay card = new ABCImpl();//农行卡
		//UnionPay card = new ICBCImpl();//工行卡
		atm.insertCard(card);//插卡
		atm.payPhone();
	}
}
class ABCATM{	//农行ATM
	UnionPay card;	//银联卡
	void insertCard(UnionPay card){	//插卡
		this.card = card;
	}
	void payPhone(){	//支付电话费
		//判断是否是农行卡
		if(card instanceof ABCImpl){
			ABCImpl abc = (ABCImpl)card;
			abc.支付电话费();
		}else{
			System.out.println("卡类型不对");
		}
	}
}

interface UnionPay{	//银联接口
	void 存钱();
	void 取钱();
	void 改密码();
	void 查余额();
}
interface ICBC extends UnionPay{  //工行接口
	void 在线支付();
}
interface ABC extends UnionPay{	//农行接口
	void 支付电话费();
}
class ICBCImpl implements ICBC{//工行实现类
	public void 存钱(){};
	public void 取钱(){};
	public void 改密码(){};
	public void 查余额(){};
	public void 在线支付(){};
}
class ABCImpl implements ABC{//农行实现类
	public void 存钱(){};
	public void 取钱(){};
	public void 改密码(){};
	public void 查余额(){};
	public void 支付电话费(){
		System.out.println("支付话费成功");
	};
}











