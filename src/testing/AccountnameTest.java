package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountnameTest {

	@Test
	void test() {
		Fitnesstesting test = new Fitnesstesting();
		assertEquals("michael", test.personName);
	}

}
