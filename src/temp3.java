/**
 * Created by mykalburris on 12/11/16.
 */
import java.util.Scanner;

public class temp3 {
    public static void main(String [] args) {

        int a[][] = {
            {19, 22, 31, 42},
            {50, 61, 32, 83},
            {93, 47, 15, 66}
        };

//        for (int row = 0; row < a.length; row++){
//            for (int col = 0; col < a[0].length; col++ ){
//                System.out.println(a[row][col]);
//            }
//        }

        for (int col = 0; col < a[0].length; col++ ){
            for (int row = 0; row < a.length; row++){

                System.out.println(a[row][col]);
            }
        }
    }
}
