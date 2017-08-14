package Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author mccauleyr
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        
        // Input array contents from filename specified
        //creating File instance to reference text file in Java, that is located
        // in same folder as this file
        File text = new File("/Users/mykalburris/IdeaProjects/CSCI221/src/Lab6/input.txt");
        
        //Creating Scanner instnace to read File in Java
        Scanner scan = new Scanner(text);
        
        // Read 2-D array parameters, # of rows, # of cols
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        
        // Declare and allocate array of size rowsxcols that stores integers
        int [][] arr = new int [rows][cols];
        
        // Input values into array by rows
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                arr[row][col] = scan.nextInt();
            }
        }

        int elem;
        double sum = 0;
        double avg = 0;
        double[] studentAverage = new double[10];

        System.out.print("\t  \t \t Lab 1 \tLab 2 \tLab 3 \tLab 4 \tLab 5 \tAverage\n");

        for (int row = 0; row < rows; row++){
            System.out.print("Student #" + (row+1) + "\t ");

            for (int col = 0; col < cols; col++){
                elem =  arr[row][col];
                sum += arr[row][col];
                avg = sum/cols;

                System.out.print(elem);
                System.out.print("\t \t");
            }

            sum = 0;
            studentAverage[row] = avg;
            System.out.println(studentAverage[row]);
        }


//        System.out.print("Low score\t \t");

//
        int max_score;
        int min_score;
        int score;
        int[] max = new int[cols];
        int[] min = new int[cols];

        for (int row = 0; row < cols; row++)
        {
            max_score = arr[row][0];
            min_score = arr[row][0];
             for (int col = 0; col < rows; col++)
             {
                 score = arr[col][row];
                 if (score > max_score){
                     max_score = score;
                 }
                 if (score < min_score){
                     min_score = score;
                 }
             }
            max[row] = max_score;
            min[row] = min_score;
        }

        System.out.print("High score   ");
        for (int i = 0; i < cols; i++){
            System.out.print(max[i] + "\t\t");
        }

        System.out.print("\nLow score    ");
        for (int i = 0; i < cols; i++){
            System.out.print(min[i] + "\t\t");
        }

    }
}

