import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * This is the main class that executes the Regular Expressions program
 */
public class RegularExpressionsMain {
	public static void main(String[] args) {
		System.out.println("Enter the base String to be matched with tests:");
		Scanner input = new Scanner(System.in);
		String base = input.nextLine();
		System.out.println("\nThe program will process ["+base+"]. Choose an " +
						"operation:\n1. containsTrue\n2. containsOKVariants\n" +
						"3. containsThreeConsecutiveLetters\n4. notStartWithNumbers" +
						"\n5. startWithThreeConsecutiveNumbers\n6. unionNumbersZero" +
						"TwoAndSevenNine\n7. containsNumbersLessThan300\n" + 
						"8. autocorrect");
		try {
			int item = input.nextInt();
			boolean answer = false;
			RegularExpressions re = new RegularExpressions(base);
			switch(item) {
				case 1:
					answer = re.containsTrue();
					break;
				default:
					System.out.println("Bad option. Program finishes.");
					break;
			}
			System.out.println("Chosen option "+item+" returned "+answer);
		}
		catch(InputMismatchException e) {
			System.out.println("Bad option. Program finishes.");
		}
	}
}
