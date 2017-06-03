package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {
	
	@Test
	public void test() {
		Demo d=new Demo();
		assertEquals(4, d.square(2));
	}

}
