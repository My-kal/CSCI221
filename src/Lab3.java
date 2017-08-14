/*
 * @author Mykal Burris
 * @since 09/14/16
 * @version 1
 * Java class that solves the Riddler's puzzle for Batman
 */
//package hw2.csci221;
import java.util.HashSet;

public class Lab3 {
    public static void main(String[] args) {
        int n1,n2,n3,n4;

        for (int index = 1000; index<=9999; index++){
            boolean sum_is27 = false, no_duplicates = false, triple = false, odd = false;
            n1 = index / 1000;
            n2 = index / 100 % 10;
            n3 = index / 10 % 10;
            n4 = index  % 10;

            // check if odd
            if (index % 2 != 0) {
                odd = true;

                //check if thousands place digit is 3x tens place digit
                if (n1 / 3 == n3) {
                    triple = true;

                    // check if sum is 27
                    if (n1 + n2 + n3 + n4 == 27) {
                        sum_is27 = true;

                        // check if all digits are different
                        HashSet<Integer> duplicate_set = new HashSet<Integer>();
                        duplicate_set.add(n1);
                        duplicate_set.add(n2);
                        duplicate_set.add(n3);
                        duplicate_set.add(n4);
                        if (duplicate_set.size() == 4) {
                            no_duplicates = true;
                        } // end of duplicates
                    } // end of sum
                } // end of triple
            } // end of odd

            if (no_duplicates && sum_is27 && triple && odd) {
                System.out.println("The address is " + index + " Pennsylvania Avenue.");
            }

        } // end of for loop
    }
}
