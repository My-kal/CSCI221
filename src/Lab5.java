/**
 * This class calculates min, max, mean, and variance given a set of 10 numbers
 * @author Mykal Burris
 * @since October 03, 2016
 * @version  1
 */

import java.util.Scanner;

public class Lab5 {
    public static int N = 10;

    public static void main(String[] args) {
        double[] x = new double[N];
        double min, max, mean, variance;

        Scanner stdin = new Scanner(System.in);

        int y = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter double value [%d of %d]: ", ++y, N);
            double elem = stdin.nextDouble();
            x[i] = elem;
        }

        min = x[0];
        max = x[9];
        for (int i = 1; i < 10; i++) {
            if (x[i] < min){
                min = x[i];
            }
            if (x[i] > max){
                max = x[i];
            }
        }
        System.out.printf("\nMin: %.3f, ", min);
        System.out.printf("Max: %.3f, ", max);

        double sum = 0;
        for (int i = 0; i < 10; i++){
            sum += x[i];
        }

        mean = sum / N;
        System.out.printf("Mean: %.3f, ", mean);

        double sum2 = 0;
        for (int i = 0; i < 10; i++){
            sum2 += Math.pow(x[i]-mean, 2);
            sum2 += (x[i]-mean)*(x[i]-mean);
        }
        variance = sum2 / N;
        System.out.printf("Variance: %.3f",  variance);
    }

}