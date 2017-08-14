 //package Lab9;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

/**
 * Lab9.java
 * @author code provided by CSCI 221 instructor
 * @author Mykal Burirs completed the palindrome method
 * @date 11-22-2016
 *
 * Checks if an input string is a palindrome
 */
public class Lab9 {
	/**
	 * Verifies if the characters in test form a palindrome
	 * @param test - input string as an array
	 * @param i - first position in string under consideration
	 * @param j - last position in string under considerations
	 * @return true if test is a palindrome, false otherwise
	 */
	public static boolean palindrome( char[] test, int i, int j ) {
	    boolean palindrome;
        if (i == j || i > j){
            palindrome =  true;
        } else if (test[i] != test[j]){
            palindrome = false;
        }
        else{
            palindrome = palindrome(test, i+1, j-1);
        }
        return  palindrome;
		// ------------------------------------------
		// 	Hints:
		// ------------------------------------------
		//  1. i and j are variables that point to front (i) and back (j) of the test array.
		//
		//  2. Branching conditions:
		//  		- 2 base cases (i.e. terminating conditions)
		//              a) If i == j or i > j, then test IS A palindrome
		//                 and the method must return TRUE.
		//              b) If test[i] != test[j], then test IS NOT a palindrome
		//                 and the method must return FALSE.
		//  	    - General case: If test[i] == test[j], then there is a possibility
		//			that this string is a palindrome, check the rest of it by
		//			making a the recursive call on the part of the string not yet checked.
		// 			That is, if the last call was on "racecar", the next call is on "aceca"
		//
		//  3. remove the "return true" line below that makes this empty method
        //      compilable
//        return palindrome;
	} // end palindrome() method

       /**
	 *
	 * DO NOT MODIFY THE CODE IN THE MAIN METHOD
	 *
	 * @param args
	 */
	public static void main( String[] args ) {

		Scanner input = new Scanner( System.in );

		System.out.print("Enter test string: " );

		String inputString = input.nextLine();
                // convert String to an array of char
		char [] test = inputString.toCharArray();

		//-------------------------------------------------------
		// Call recursive method and set i=0 (index position of the first
		// element in the character array) and j=test.length-1 (index
		// position of the last element in the character array).
		boolean isPalindrome = palindrome( test, 0, test.length-1 ) ;

		//-------------------------------------------------------
		// Display the results
		System.out.printf("\"%s\" is a palindrome -> %b\n", inputString, isPalindrome );

	} // end main() method


} // end Lab9 class definition
