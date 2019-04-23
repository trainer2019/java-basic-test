package question;

public class AddingSeriesNumber {

	public static void main(String[] args) {

		int addingCount = Integer.parseInt(args[0]);

		int sum = 0;
		for (int i = 0; i < addingCount; i++) {
			int seriesNumber = i + 1;
			sum = sum + seriesNumber;
		}
		System.out.println(sum);
	}

}
