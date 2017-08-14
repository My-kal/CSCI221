package HW7;

import java.util.ArrayList;

/**
 * The shell of a Stack implementation is provided.
 * You must complete all methods, but calling the appropriate
 *   ArrayList methods.
 * You must also create the EmptyStackException class.
 *
 * @author mccauleyr
 * @editor mykal burris
 */
public class Queue<E> implements Agenda<E> {

    ArrayList<E> queue;

    /**
     * Create a new empty queue;
     * @return
     */
    public Queue(){
        queue = new ArrayList<E>();
    }

    /**
     * check if there are any items/tasks on an agenda
     * @return true if there are items, false otherwise
     */
    public boolean isEmpty ( ) {
        return queue.isEmpty();
    }

    /**
     * find out how many tasks/items are on an agenda
     * @return the number of items on the list
     */
    public int size (){
        return queue.size();
    }

    /**
     * add tasks/items to an agenda
     * @param item to be added to the agenda
     */
    public void add( E item){
        queue.add(item);
    }

    /**
     * remove tasks/items from an agenda
     * @throws EmptyStackException- fix in header below
     */
    public void remove ( ) throws EmptyQueueException {
        if (queue.isEmpty()) throw new EmptyQueueException();
        queue.remove(0);
    }

    /**
     * check/read the next item/task without removing it
     * @return a copy of the item on the list
     * @throws EmptyStackException- fix in header below
     */
    public E peek ( ) throws EmptyQueueException {
        if (queue.isEmpty()) throw new EmptyQueueException();
        return queue.get(0);
    }

    public String toString(){
        String str = "Queue contents: \n";
        for (E e : queue){
           str += (e + "\n");

        }
        return str;
    }

    public Queue copy(){
        Queue copy = new Queue();
        for (E e : queue){
            copy.add(e);
        }
        return copy;
    }

    /**
     * To test my queue methods
     * @param args
     */
    public static void main(String [] args) {

        // Instantiate an empty queue to hold String objects
        Queue<String> q = new Queue<>();

        // Add statements to add some Strings to the stack;
        q.add("hi");
        q.add("my");
        q.add("name");
        q.add("is");
        q.add("mykal");

        // Show the contents of the stack
        System.out.println(q.toString());

        Queue<String> q2 = q.copy();
        System.out.println(q2.toString());

        // Add statements to empty the stack by removing all
        //   items from the stack until it is empty. Print the
        //   string being removed.

        while (!q.isEmpty()) {
            try {
                System.out.println("Removing: " + (q.peek()));
                q.remove();
                System.out.println(q.toString());
            } catch (EmptyQueueException e) {
                System.out.println(e);
            }
        }

        // Attempt to remove a String from an empty stack.
        //   Catch that exception and print appropriate message.
        try{
            q.remove();
        }catch (EmptyQueueException e){
            System.out.println(e);
        }


    }
}
