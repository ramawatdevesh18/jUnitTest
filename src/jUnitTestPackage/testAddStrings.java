package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	jUnitFunction t = new jUnitFunction();
	@Test
	public void test() {
		assertEquals( "Regular string addition should work", t.AddStrings("a","b"),"ab");
	}
}
