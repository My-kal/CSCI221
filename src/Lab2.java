/*
 * @author Mykal Burris
 * @since 09/09/16
 * @version 1
 * Java class that computes and prints heat index given temperature and humidity
 */

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int consecutives = 0;
        int primero;
        int segundo = -1;

       boolean primeSecond = false;
        int n = 023;
        String string_n = Integer.toString(n);
        if (string_n.length() >= 2){
            char second_leading = string_n.charAt(1);
             if (second_leading == '2' || second_leading == '3' || second_leading == '5' || second_leading == '7'){
                primeSecond = true;
            }else {
                primeSecond = false;
                }
            }
        else  {
            primeSecond = false;
        }

//                System.out.println("Enter a temperature value in Fahrenheit: ");
//        double temperature = stdin.nextDouble();
//
//        System.out.println("Enter a humidity value in percent (ex: enter 50 for 50%): ");
//        double humidity = stdin.nextDouble();
//
//        final double T2 = temperature * temperature;
//        final double H2 = humidity * humidity;
//        final double n1 = 42.379;
//        final double n2 = 2.04901523;
//        final double n3 = 10.14333127;
//        final double n4 = 0.22475541;
//        final double n5 = 6.83783e-3;
//        final double n6 = 5.481717e-2;
//        final double n7 = 1.22874e-3;
//        final double n8 = 8.5282e-4;
//        final double n9 = 1.99e-6;
//
//        if (temperature >= 80 && humidity >= 40) {
//            double heatIndex = -n1 + (n2 * temperature) + (n3 * humidity) - (n4 * temperature * humidity);
//            heatIndex += -(n5 *  T2) - (n6 * H2) + (n7 * T2 * humidity) + (n8 * temperature * H2) - (n9 * T2 * H2);
//            System.out.printf("Heat index: %.2f Fahrenheit.", heatIndex);
//        } else {
//            System.out.println("Heat index cannot be computed.");
//        }
    }
}
