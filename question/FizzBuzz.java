package question;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {

            int number = i + 1;

            if (number % 3 == 0) {
                System.out.println("fizz");

            } else if (number % 5 == 0) {
                System.out.println("buzz");

            } else if (number % 15 == 0) {
                System.out.println("fizzbuzz");

            } else {
                System.out.println(number);
            }
        }
    }
}
