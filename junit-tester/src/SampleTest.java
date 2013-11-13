import static org.junit.Assert.*;

import org.junit.Test;


public class SampleTest {

	@Test
	public void test() {
		SampleClass sc=new SampleClass("hi");
		assertEquals("not good","HI",sc.getString());
		assertEquals("not good","hi",sc.getLower());
	}

}
