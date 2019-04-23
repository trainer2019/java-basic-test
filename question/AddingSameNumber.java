package question;

public class AddingSameNumber {

	public static void main(String[] args) {

		int targetNumber = Integer.parseInt(args[0]);
		int addingCount = Integer.parseInt(args[1]);

		int sum = 0;
		for (int i = 0; i < addingCount; i++) {
			sum = sum + targetNumber;
		}

		System.out.println(sum);
	}

}
