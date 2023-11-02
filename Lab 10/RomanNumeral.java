package edu.ua.cs.cs200.lab10;

public class RomanNumeral {

	/**
	 * The number represented by this Roman numeral.
	 */
	private final int num;

	/**
	 * The following arrays are used by the toString() function to construct the
	 * standard Roman numeral representation of the number. For each i, the
	 * number numbers[i] is represented by the corresponding string, letters[i].
	 */
	private static int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	private static String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	/**
	 * Constructor. Creates the Roman number with the int value specified by the
	 * parameter.
	 * 
	 * @param arabic
	 *            the number in arabic format
	 * @throws NumberFormatException
	 *             if arabic is not in the range 1 to 3999 incluside
	 */
	public RomanNumeral(int arabic) {

		if (arabic < 1)
			throw new NumberFormatException("Value of RomanNumeral must be positive.");
		if (arabic > 3999)
			throw new NumberFormatException("Value of RomanNumeral must be 3999 or less.");
		num = arabic;
	}

	/**
	 * Constructor. Creates the Roman number with the given representation. For
	 * example, RomanNumeral("xvii") is 17. Both upper and lower case letters
	 * are allowed.
	 * 
	 * @param roman
	 *            the roman number
	 * @throws NumberFormatException
	 *             If the parameter is not a legal Roman numeral
	 */
	public RomanNumeral(String roman) {
		if (roman.length() == 0)
			throw new NumberFormatException("An empty string does not define a Roman numeral.");

		// Convert to upper case letters.
		roman = roman.toUpperCase();

		// A position in the string, roman;
		int i = 0;

		// Arabic numeral equivalent of the part of the string that has been
		// converted so far.
		int arabic = 0;

		while (i < roman.length()) {

			// Letter at current position in string.
			char letter = roman.charAt(i);

			// Numerical equivalent of letter.
			int number = letterToNumber(letter);

			if (number < 0)
				throw new NumberFormatException("Illegal character \"" + letter + "\" in roman numeral.");

			// Move on to next position in the string
			i++;

			// There is no letter in the string following the one we have just
			// processed. So just add the number corresponding to the single
			// letter to arabic.
			if (i == roman.length()) {
				arabic += number;
			}
			// Look at the next letter in the string. If it has a larger Roman
			// numeral equivalent than number, then the two letters are counted
			// together as a Roman numeral with value (nextNumber - number).
			else {
				int nextNumber = letterToNumber(roman.charAt(i));
				// Combine the two letters to get one value, and move on to next
				// position in string.
				if (nextNumber > number) {
					arabic += (nextNumber - number);
					i++;
				}
				// Don't combine the letters. Just add the value of the one
				// letter onto the number.
				else {
					arabic += number;
				}
			}

		}

		if (arabic > 3999)
			throw new NumberFormatException("Roman numeral must have value 3999 or less.");

		num = arabic;

	}

	/**
	 * Find the integer value of letter considered as a Roman numeral. The
	 * letter must be uppercase.
	 * 
	 * @param letter
	 * @return -1 if letter is not a legal Roman numeral.
	 */
	private int letterToNumber(char letter) {
		switch (letter) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

	/**
	 * Return the standard representation of this Roman numeral.
	 * 
	 * @return the roman numeral in string
	 */
	public String toString() {
		// The roman numeral.
		String roman = "";

		// N represents the part of num that still has to be converted to Roman
		// numeral representation.
		int N = num;
		for (int i = 0; i < numbers.length; i++) {
			while (N >= numbers[i]) {
				roman += letters[i];
				N -= numbers[i];
			}
		}
		return roman;
	}

	/**
	 * 
	 * @return the value of this Roman numeral as an int.
	 */
	public int toInt() {
		return num;
	}

}
