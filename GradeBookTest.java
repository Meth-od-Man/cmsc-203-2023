import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook object;
	GradeBook N;
	@BeforeEach
	void setUp() throws Exception {
object = new GradeBook(5);
N = new GradeBook(5);
		object.addScore(2);
		object.addScore(0);
		N.addScore(1);
		N.addScore(2);
		N.addScore(3);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		GradeBook N = null;
		GradeBook object = null;
	}

	@Test
	void testGetScoresSize() {
		assertEquals(2 , object.getScoresSize(2));
		assertEquals(3, N.getScoresSize(3));
		
	}

	@Test
	void testAddScore() {

		assertEquals(true, object.addScore(3));
		assertEquals(true, N.addScore(0));
		
		
	}

	@Test
	void testSum() {
		assertEquals(2.0, object.sum());
		assertEquals(6.0, N.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(0.0, object.minimum());
		assertEquals(1.0, N.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(2.0, object.finalScore());
		assertEquals(5.0, N.finalScore());
	}

	@Test
	void testToString() {

		assertEquals("2.0 0.0", object.toString());
		assertEquals("1.0 2.0 3.0", N.toString());
		
	}

}
