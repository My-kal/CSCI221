import java.util.Scanner;

public class LargeSmallAverage {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int min = 9999999;
        int max = 0;
        double avg = 0;
        int num_count = 0;
        int num;
        double total = 0;

        System.out.println("This program allows you to enter a list of positive integers");
        System.out.println("(terminated by a -1) then displays the largest value,");
        System.out.println("smallest value, and average of the list of numbers,");
        System.out.println("not including the final (negative) value that ends the list.");


        do {
            System.out.println("Enter a positive integer, or -1 to quit: ");
            num = stdin.nextInt();

            if (num > 0) {
                num_count ++;
                total += num;
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            }
        }while (num >= 0);
        avg = total / num_count;
        if (num_count > 1){
            System.out.println("Avg:" + avg);
            System.out.println("Max:" + max);
            System.out.println("Min:" + min);}
        else{
            System.out.println("You did not enter any positive integers.");
        }
    }
}