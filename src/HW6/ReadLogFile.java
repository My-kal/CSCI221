package HW6;

/**
 * @author Mykal Burris
 * @since 18-Nov-2016
 * 
 * Class Description: Tests exception classes
 * 
 * 
 * 
 * 
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLogFile {

	public static void main(String[] args) throws FileNotFoundException{
		/*=========================================
		 *= DO NOT change these two lines of code =
		 *=========================================
		 */
			String[] keywords = {"ToDo", "DONE"};
			char[] invalidSymbols = {'!', '@', '&'};
		//======END do not change section==========
//
//		String path = "/Users/mykalburris/IdeaProjects/CSCI221/src/HW6/file1.txt";
		String path = "/Users/mykalburris/IdeaProjects/CSCI221/src/HW6/badfile1.txt";
//		String path = "/Users/mykalburris/IdeaProjects/CSCI221/src/HW6/badfile2.txt";

        // throw file not found exception

		//Place your code below
        File text = new File(path);
		Scanner scan = new Scanner(text);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            CheckLine cl = new CheckLine(keywords, invalidSymbols);

            try {
                cl.checkForInvalidSymbols(line);
            } catch (SymbolException e) {
                System.out.println(e);
                System.exit(-1);
            }

            try {
                cl.checkForInvalidKeyword(line);
            } catch (KeywordException e) {
                System.out.println(e);
                System.exit(-1);
            }

            if (cl.checkFirstKeyword(line)) System.out.println(line);

        }
	}//END main

}//END ReadLogFile class
