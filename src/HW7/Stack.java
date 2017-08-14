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
public class Stack<E> implements Agenda<E> {

    ArrayList<E> stack;

    /**
     * Create a new empty stack;
     * @return
     */
    public Stack(){
        stack = new ArrayList<E>();
    }

    /**
     * check if there are any items/tasks on an agenda
     * @return true if there are items, false otherwise
     */
    public boolean isEmpty ( ) {
        return stack.isEmpty();
    }

    /**
     * find out how many tasks/items are on an agenda
     * @return the number of items on the list
     */
    public int size (){
        return stack.size();
    }

    /**
     * add tasks/items to an agenda
     * @param item to be added to the agenda
     */
    public void add( E item){
        stack.add(item);
    }

    /**
     * remove tasks/items from an agenda
     * @throws EmptyStackException- fix in header below
     */
    public void remove ( ) throws EmptyStackException {
        if (stack.isEmpty()) throw new EmptyStackException();
        stack.remove(stack.size()-1);
    }

    /**
     * check/read the next item/task without removing it
     * @return a copy of the item on the list
     * @throws EmptyStackException- fix in header below
     */
    public E peek ( ) throws EmptyStackException {
        if (stack.isEmpty()) throw new EmptyStackException();
        return stack.get(stack.size()-1);
    }

    public String toString(){
        String  str = "Stack contents: \n";
        for (E elem : stack){
            str += (elem + "\n");
        }
        return str;
    }

    /**
     * creates deep copy
     */
    public Stack copy(){
        Stack copy = new Stack();
        for (E e : stack){
            copy.add(e);
        }
        return copy;
    }

    /**
     * To test my stack methods
     * @param args
     */
    public static void main(String [] args) {

        // Instantiate an empty stack to hold String objects
        Stack<String> s = new Stack();

        // Add statements to add some Strings to the stack;
        s.add("hi");
        s.add("my");
        s.add("name");
        s.add("is");
        s.add("mykal");


        // Show the contents of the stack
        System.out.println(s.toString());

        Stack<String> s2 = s.copy();

        try {
            s.remove();
        }catch (EmptyStackException e) {
            System.out.println(e);
        }
        System.out.println(s2.toString());

        // Add statements to empty the stack by removing all
        //   items from the stack until it is empty. Print the
        //   string being removed.


        while (!s.isEmpty()) {
            try {
                System.out.println("Removing: " + s.peek());
                s.remove();
                System.out.println(s.toString());
            } catch (EmptyStackException e) {
               System.out.println(e);
            }
        }

        // Attempt to remove a String from an empty stack.
        //   Catch that exception and print appropriate message.
        try{
            s.remove();
        }catch (EmptyStackException e){
            System.out.println(e);
        }

    }

}
