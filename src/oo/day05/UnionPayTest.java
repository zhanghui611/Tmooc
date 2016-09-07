package oo.day05;

public class UnionPayTest {

	public static void main(String[] args) {
		//创建工行对象
		ICBCImpl icbc = new ICBCImpl();
		ICBC icbc1 = new ICBCImpl();
		UnionPay icbc2 = new ICBCImpl();
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
	public void 支付电话费(){};
}











