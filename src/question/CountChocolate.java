package question;

public class CountChocolate {
    public static void main(String[] args) {

        int dozen = Integer.parseInt(args[0]);
        int rest = Integer.parseInt(args[1]);

        final int DOZEN = 12;
        int sumChocolate = dozen * DOZEN + rest;

        System.out.println("全部で " + sumChocolate + " 個のチョコレートがあります。");
    }
}
