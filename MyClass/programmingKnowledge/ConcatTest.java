package programmingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void Concattest() {
		MyJUnitClass jUnit=new MyJUnitClass();
		String result=jUnit.Concat("a","b");
		assertEquals("ab", result);
	}

}
