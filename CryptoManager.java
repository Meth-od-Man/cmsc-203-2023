/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jared Hernandez
*/

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		char letter;
		for(int i = 0; i < plainText.length(); i ++) {
			letter = plainText.charAt(i);
		if((LOWER_RANGE > letter)||(letter > UPPER_RANGE)) {
			return false;
		}
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		String caesarText = "";
		char letter;
		int trueValue;
		
		if(isStringInBounds(plainText) == true) {
			
			for(int i = 0; i < plainText.length(); i ++) {
				trueValue = plainText.charAt(i)+key;
				while (trueValue > UPPER_RANGE) {
					trueValue -= 64; 
				}
				letter = (char) (trueValue);
				caesarText += letter;
		}
		
		return caesarText;}
		
		else return "The selected string is not in bounds, Try again.";
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		int keyLength = bellasoStr.length();
		int j = 1;
		String bellasoText = "";
		int x;
	
		if(isStringInBounds(plainText) == true) {
		for(int i = 0; i < plainText.length(); i ++) {
			
			if(j > keyLength) {j=1;}	
			x = plainText.charAt(i)+ bellasoStr.charAt(--j);
			j++;
			while( x >UPPER_RANGE) {
				x -= RANGE; 
			};
		
			
			
			bellasoText += (char)(x);
			
			j++;
		}
		return bellasoText;
		}else return "The selected string is not in bounds, Try again.";
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		String caesarText = "";
		char letter;
		int trueValue;
		
		
			
			for(int i = 0; i < encryptedText.length(); i++) {
				trueValue = encryptedText.charAt(i)-key;
				while (trueValue < LOWER_RANGE) {
					trueValue += 64; 
				}
				letter = (char) (trueValue);
				caesarText += letter;
		
		
		}
			return caesarText;
	
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		int keyLength = bellasoStr.length();
		int j = 1;
		String bellasoText = "";
		int x;
	
		
		for(int i = 0; i < encryptedText.length(); i ++) {
			
			if(j > keyLength) {j=1;}	
			x = encryptedText.charAt(i)- bellasoStr.charAt(--j);
			j++;
			while( x <LOWER_RANGE) {
				x += RANGE; 
			};
		
			
			
			bellasoText += (char)(x);
			
			j++;
		}
		return bellasoText;
		
		
	}
}