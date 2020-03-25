package Remove_2A.CharRemove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Removefirst2A {

	/*
	 * TODO list
	 * 1.ABCD => BCD
       2.AACD => CD 
       3.BACD => BCD
       4.BBAA => BBAA       
       5.AABAA => BAA
       6.A     => " "
       7." "   => " "

	 */
	@Test
	void testfirst2() {
		Remove_TwoA r=new Remove_TwoA();
		String res=r.remove("ABCD");
		assertEquals("BCD",res);
	}
	

}
