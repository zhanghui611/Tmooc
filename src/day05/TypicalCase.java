package day05;

import org.junit.Test;

public class TypicalCase {
	@Test
	public void test1(){
		//�žų˷���
		for(int n=1;n<=9;n++){
			for(int i=1;i<=n;i++){
				System.out.print(i+"*"+n+"="+i*n+"\t");
			}
			System.out.println();
		}
		
	}
}
