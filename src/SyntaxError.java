/**
 * Created by mykalburris on 8/28/16.
 */

import java.util.Scanner;

public class SyntaxError {
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers to multiply.");
        Scanner keyboard = new Scanner(System.in);

        int n1, n2;

        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();

        int product = n1 * n2;

        System.out.println("The product is " + product);

    }
}
