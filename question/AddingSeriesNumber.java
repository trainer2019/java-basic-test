package question;

public class AddingSeriesNumber {

	public static void main(String[] args) {

		int targetNumber = 3;
		int addingCount = 12;

		int sum = 0;
		for (int i = 0; i < addingCount; i++) {
			sum = sum + targetNumber;
		}

		System.out.println(sum);
	}

}
