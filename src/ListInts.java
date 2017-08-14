import java.util.Arrays;
import java.util.List;

/**
 * This class stores data and manipulates arrays.
 * @author Mykal Burris
 * @since October 27, 2016
 * @version  1
 *
 */


public class ListInts {

    private int size = 0;
    private int[] ListArray;
    private int capacity;

    /**
     * pre condition: none
     * empty ListArray w/ capacity 5 instantiated
     */

    public ListInts() {
        ListArray = new int[5];
        capacity =  ListArray.length;

    }

    /**
     * pre condition: none
     *return: number of elements currently stored in the list
     */

    public int size() {
        return size;
    }


    /**
     * @param a: int to be inserted into array
     * Precondition: location is in the range of 1to size+1
     * Postcondition: contents modified as necessary and size is updated accordingly
     */

    public void insert(int a) {
        if (size != 0 && size % 5 == 0){
            this.enlarge();
        }
        ListArray[size] = a;
        size++;
    }


    /**
     *
     * @param a: int to be inserted into array
     * @param location: index for int to be inserted
     * Precondition: location is in the range of 1to size+1
     * Postcondition: contents modified as necessary and size is updated accordingly
     */

    public void insert(int a, int location) {
        location -= 1;
        if (size == 0){
            ListArray[0] = a;
        }else if(size > 0 && size < capacity){
            ListArray[size] = a;
        }else {
            enlarge();
            ListArray[size] = a;
        }
        size++;
//        if (size % 5 == 0 && size != 0){
//            this.enlarge();
//        }
//        if (location > size){
//            ListArray[size] = a;
//        }
//        if (ListArray[location] != 0) {
//            for (int i = ListArray.length-1; i > location; i--) {
//                ListArray[i] = ListArray[i-1];
//            }
//        } else {
//            ListArray[location] = a;
//        }
//        size++;
//        this.deleteNull();
    }

    /**
     * @param a: int to be found in array
     * @return index+1 where int was found
     */
    public int find(int a){
        int found = -1;
        for (int i = 0; i < ListArray.length; i++){
            if (ListArray[i] == a){
                found  = i;
            }
        }
        return found + 1;
    }

    /**
     * @param location: index+1 where element is to be deleted
     * Precondtion: none
     * Postcondition: none
     */

    public void delete(int location){
        location -= 1;
        ListArray[location] = 0;
        size --;
    }

    /**
     * Displays elements in ListArray
     * Precondition: none
     * Postcondition: none
     */

    public void displayList(){
        System.out.format("ListInts: capacity %d, size %d\n", capacity, size);
        for (int i = 0; i < ListArray.length; i++){
            if (ListArray[i] == 0) {
                System.out.format("[%d] null\n", i+1);
            } else {
                System.out.format("[%d] %d\n", i+1, ListArray[i]);
            }
        }
    }


    public void deleteNull(){
        for (int i = capacity-size; i < 0; i--) {
            if (ListArray[i] == 0 && i > size){
                ListArray[i+1] = ListArray[i];
                ListArray[i+1] = 0;
            }
        }
    }

    /**
     * Precondition: none
     * Postcondition: none
     * @return copy of ListArray
     */

    public int[] toArray(){
        int copy[] = new int[ListArray.length];
        for (int i = 0; i < ListArray.length; i++){
            copy[i] = ListArray[i];
        }
        return copy;
    }

    /**
     * Double's capacity of ListArray
     * Precondition: none
     * Postcondition: instance variables modified as
     */

    private void enlarge(){
        int[] temp = this.toArray();
        ListArray = new int[capacity*2];
        for (int i = 0; i < temp.length; i++){
            ListArray[i] = temp[i];
        }
        capacity = ListArray.length;
    }

    public static void main(String[] args)
    {
        ListInts x = new ListInts();

        x.insert(9);
        x.insert(7);
        x.insert(2);
        x.insert(0);
        x.insert(1);
        System.out.println(x.size());
        x.insert(4,4);
        System.out.println(Arrays.toString(x.ListArray));

        System.out.println(x.size());
        x.insert(3,10);
        System.out.println(x.size());

        System.out.println(Arrays.toString(x.ListArray));

        x.insert(5, 15);
        System.out.println(Arrays.toString(x.ListArray));


//       x.displayList();

}


}
