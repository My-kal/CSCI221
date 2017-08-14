import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by mykalburris on 12/2/16.
 */


public class Lab10 {
    public static void main(String args[]) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(81);
        scores.add(71);
        scores.add(60);
        scores.add(40);
        scores.add(61);
        scores.add(47);
        scores.add(72);

        Integer max = scores.get(0);

        for (Integer s : scores){
            System.out.println(s);
            if (s > max){
                max = s;
            }
        }

        System.out.println("Max: " + max);
        System.out.println();

        ListIterator<Integer> cursor = scores.listIterator();

        // in-order
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }

        System.out.println();

        // reverse
        while(cursor.hasPrevious()){
            System.out.println(cursor.previous());
        }



    }

}
