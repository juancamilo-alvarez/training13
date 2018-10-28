/* 
 * This application solves the proposed Regular Expressions exercise for the training
 * Build a Java program with the following methods:
 *
 * 1. Method containsTrue(). String matches with: "true" or “True”.
 * 2. Method containsOKVariants(). String matches with: "ok" or "oK"or "Ok" or “OK". 
 * 3. Method containsThreeConsecutivesLetters(). String contains three consecutive letters one after another. Ex: "1a2bc3def4".
 * 4. Method notStartWithNumbers(). String starts with some character other than number. Ex: “a12334bcde".
 * 5. Method startWithThreeConsecutivesNumbers(). String has three consecutive number at beginning. Ex: “123abcde”.
 * 6. Method unionNumbersZeroTwoAndSevenNine(). String has a single number between 0 and 2 or a number between 7 and 9. Ex: “8".
 * 7. Method containNumbersLessThan300(). String contains a number less than 300. Ex: "Last year I worked 299”.
 * 8. The method autocorrect must replace all instances (not case sensitive) of: “you”, “u” or “youuuu” (with any number of u characters tacked onto the end) to "my nightmare” (always lower case).
 *  
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 * This class solves the Regular Expressions problems for a given base string
 */
public class RegularExpressions {
	
	String base;

	public RegularExpressions(String base) {
		this.base = base;
	}

	public boolean containsTrue() {
		String regex1 = "true";
		String regex2 = "True";

//		Another possible solution with String methods:
//		return base.matches(regex1) || base.matches(regex2);

		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(base);

		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(base);

		boolean result = matcher1.matches() || matcher2.matches();
		
		return result;
	}

	public boolean containsOKVariants() {
		return base.matches("(?i)ok");
	}

	public void setBase(String base) {
		this.base = base;
	}
}
