package q8;

import java.util.Scanner;

public class NumbersExec {

    public static void main(String[] args) {
        System.out.println("Type first number.");

        // Using scanner class just for testing purposes, limitations of it were not treated.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Type second number.");

        int b = sc.nextInt();

        int result = Numbers.numberGame(a, b);

        System.out.println("The result following the requeriments was: " + result);
    }

}
