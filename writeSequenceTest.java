

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Rule;
import org.junit.jupiter.api.Test;

class writeSequenceTest {

	@Test
	void writeSequenceTest() {
		writeSequence w = new writeSequence();
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		w.writeSequence(6);
		assertEquals("3 2 1 1 2 3 ", outContent.toString());
	}

}
