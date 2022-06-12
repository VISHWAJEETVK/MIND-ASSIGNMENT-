package hello.java_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class helloMynameTest {

	@Test
	public void HelloTest() {
		hello junit = new hello();
		String result = junit.Concat("Hello","");
		assert(result.startsWith("Hello"));
		
	}

}
