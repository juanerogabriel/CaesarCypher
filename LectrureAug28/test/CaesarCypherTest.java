import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCypherTest {

	@Test
	void testEncode1() {
		CaesarCypher c = new CaesarCypher(3);
		assertEquals("KHOOB", c.encode("HELLO"));
	}

}
