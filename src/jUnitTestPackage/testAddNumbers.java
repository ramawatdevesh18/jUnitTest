package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	jUnitFunction t =new jUnitFunction();
	@Test
	public void test() {
		assertEquals("Regular integer should work",t.AddNumbers(4,5),9);
	}

}
