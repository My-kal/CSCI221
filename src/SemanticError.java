/**
 * Created by mykalburris on 8/28/16.
 */

import java.util.Scanner;

public class SemanticError
{
    public static void main(String[] args)
    {
       int height=0, width=0, length=0;

        System.out.println("Enter the height, width, and length of");
        System.out.println("a box and I will compute the volume.");

        Scanner keyboard = new Scanner(System.in);

        height = keyboard.nextInt();
        width = keyboard.nextInt();
        length = keyboard.nextInt();

        int volume = height * width * length;

        System.out.println("The volume is " + volume);

    }

}
