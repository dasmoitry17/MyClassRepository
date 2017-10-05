package programmingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void Addtest() {
		MyJUnitClass jUnit=new MyJUnitClass();
		int result=jUnit.add(100, 200);
		assertEquals(300, result);
	}

}
