package question;

public class Shopping {
    public static void main(String[] args) {

        int money = Integer.parseInt(args[0]);
        System.out.println("I have " + money + " yen.");

        if (money >= 5000) {
            System.out.println("Buy clothes.");
            money = money - 5000;
        }

        if (money >= 4000) {
            System.out.println("Buy bag.");
            money = money - 4000;
        } else if (money >= 2500) {
            System.out.println("Buy shoes.");
            money = money - 2500;
        } else {
            System.out.println("Buy book.");
            money = money - 1500;

        }

        if (money >= 1000) {
            System.out.println("Eat cake.");
            money = money - 1000;
        } else {
            System.out.println("Eat ice.");
            money = money - 500;
        }

        if (money >= 300) {
            System.out.println("Drink cola.");
            money = money - 300;
        } else {
            System.out.println("Drink water.");
        }

        if (money >= 0) {
            System.out.println(money + " yen is left.");
        } else {
            System.out.println((money * -1) + " yen is loan.");
        }
    }
}
