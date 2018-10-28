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
 */

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/*
 * This class performs tests for the RegularExpressions.java program
 * To compile: javac -cp .:junit-4.10.jar RegularExpressionsTest.java
 * To run tests: java .cp .:junit-4.10.jar org.junit.runner.JUnitCore RegularExpressions
 */
public class RegularExpressionsTest {

	/*
	 * Test #1
	 */
	@Test
	public void containsTrueTest() {
		RegularExpressions re = new RegularExpressions("true");

		boolean test1_1 = re.containsTrue();
		assertTrue("Test 1_1: Base string should match for true",test1_1);

		re.setBase("True");
		boolean test1_2 = re.containsTrue();
		assertTrue("Test 1_2: Base string should match for True",test1_2);

		re.setBase("tRue");
		boolean test1_3 = re.containsTrue();
		assertTrue("Test 1_3: Any variation of capital letters of true other than True should not match",!test1_3);
		
		re.setBase(" true");
		boolean test1_4 = re.containsTrue();
		assertTrue("Test 1_4: Any true with additional characters should not match",!test1_4);

		re.setBase(" True");
		boolean test1_5 = re.containsTrue();
		assertTrue("Test 1_5: Any True with additional characters should not match",!test1_5);
		
		re.setBase("");
		boolean test1_6 = re.containsTrue();
		assertTrue("Test 1_6: Empty should not match",!test1_6);

		re.setBase("");
		boolean test1_7 = re.containsTrue();
		assertTrue("Test 1_7: Null should not match",!test1_7);

	}

	/*
	 * Test #2
	 */
	@Test
	public void containsOKVariantsTest() {
		RegularExpressions re = new RegularExpressions("ok");
		boolean test2_1 = re.containsOKVariants();
		assertTrue("Test 2_1: ok should match",test2_1);

		re.setBase("oK");
		boolean test2_2 = re.containsOKVariants();
		assertTrue("Test 2_2: oK should match",test2_2);

		re.setBase("Ok");
		boolean test2_3 = re.containsOKVariants();
		assertTrue("Test 2_3: Ok should match",test2_3);

		re.setBase("Ok");
		boolean test2_4 = re.containsOKVariants();
		assertTrue("Test 2_4: OK should match",test2_4);
	}
}




