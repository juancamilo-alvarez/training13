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

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/*
 * This class performs tests for the RegularExpressions.java program
 */
public class RegularExpressionsTest {

	@Test
	public void containsTrueTest() {
		RegularExpressions re = new RegularExpressions("true");

		boolean test1 = re.containsTrue();
		assertTrue("Test 1: Base string should match for true",test1);

		re.setBase("True");
		boolean test2 = re.containsTrue();
		assertTrue("Test 2: Base string should match for True",test2);
		
		re.setBase(" true");
		boolean test3 = re.containsTrue();
		assertTrue("Test 3: Any string containing true should not match",!test3);

		re.setBase(" True");
		boolean test4 = re.containsTrue();
		assertTrue("Test 4: Any string containing True should not match",!test4);
		
		re.setBase("");
		boolean test5 = re.containsTrue();
		assertTrue("Test 5: Empty should not match",!test5);

		re.setBase("");
		boolean test6 = re.containsTrue();
		assertTrue("Test 6: Null should not match",!test6);

	}

}




