package checknumber;

import java.util.Scanner;

public class Checknumber {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        n = s.nextInt();
        if (n > 0) {
            System.out.println("THE NUMBER IS POSITIVE");
        } else if (n < 0) {
            System.out.println("THE NUMBER IS NEGATIVE");

        } else {
            System.out.println("THE NUMBER IS ZERO");

        }
    }
}
