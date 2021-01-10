package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sets_Sex_Test {

	@Test
	void test() {
		Fitnesstesting test = new Fitnesstesting();
		assertEquals("M".charAt(0),test.sex);
	}

}
