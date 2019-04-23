package question;

public class SimpleDivision {

	public static void main(String[] args) {

		int val01 = Integer.parseInt(args[0]);
		int val02 = Integer.parseInt(args[1]);

		try {
			System.out.println(val01 / val02);
			System.out.println("function finished.");
		} catch (ArithmeticException e) {
			System.out.println("[ERROR] ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[ERROR] ArrayIndexOutOfBoundsException");
		}
	}

}
