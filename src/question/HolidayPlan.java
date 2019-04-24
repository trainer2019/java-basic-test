package question;

public class HolidayPlan {
    public static void main(String[] args) {

        String weather = args[0];
        int temperature = Integer.parseInt(args[1]);

        if ((weather.equals("Sunny")) && (temperature > 20)) {
            System.out.println("I going to play baseball in park.");

        } else if (weather.equals("Rainy")) {
            if (temperature > 15) {
                System.out.println("I going to watch a movie at a cinema.");
            } else {
                System.out.println("I going to drink warm soup at the restaurant.");
            }

        } else {
            System.out.println("I going to read book in my house.");
        }
    }
}
