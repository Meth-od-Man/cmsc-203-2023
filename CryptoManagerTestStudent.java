/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 10/16/2023
 * Platform/compiler:
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jared Hernandez
*/

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {
CryptoManager tester;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsStringInBounds() {
		assertFalse(CryptoManager.isStringInBounds("|I cant believe its not coded!|"));
		
	}

	@Test
	void testCaesarEncryption() {
		assertEquals("IFMQ!NF",CryptoManager.caesarEncryption("HELP ME",1));
	}

	@Test
	void testBellasoEncryption() {
		assertEquals("\\BPM",CryptoManager.bellasoEncryption("NAH?", "NAH"));
	}

	@Test
	void testCaesarDecryption() {
		assertEquals("CAN I BORROW A FRY?", CryptoManager.caesarDecryption("DBO!J!CPSSPX!B!GSZ@", 1));
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("CHEESE", CryptoManager.bellasoDecryption("QIXY,S","NASTY"));
	}

}
