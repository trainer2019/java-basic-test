package question;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatePaidAmount {

	public static void main(String[] args) {

		final BigDecimal taxRate = new BigDecimal("1.08");

		BigDecimal price = new BigDecimal(250);
		BigDecimal purchase = new BigDecimal(5);
		BigDecimal discount = new BigDecimal(300);

		BigDecimal saleAmount = price.multiply(purchase);

		if (saleAmount.compareTo(new BigDecimal(1000)) > 0) {
			saleAmount = saleAmount.subtract(discount);
		}

		saleAmount = saleAmount.multiply(taxRate);
		saleAmount.setScale(0, RoundingMode.DOWN);

		System.out.println(saleAmount);
	}

}