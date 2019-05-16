package calculadoraJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		assertEquals(3, 4, "3 es distinto de 4");
	}

}
