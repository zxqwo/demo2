package seleniumzxq;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class b {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	int f=(a.c)/(a.b);
	System.out.println(f);
		assertEquals(2,f);
	}

}
