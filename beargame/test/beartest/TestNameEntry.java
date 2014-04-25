package beartest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNameEntry{

	@Test
	public void testString() {
		beargame.Tools s = new beargame.Tools();
		
		String e = "Eric";
		
		assertTrue(s.IsString(e));
		
		fail("Failure.");
	}
	

}
