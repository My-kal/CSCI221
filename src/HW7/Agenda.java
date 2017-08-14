package HW7;

/**
 * An agenda is a list of tasks to perform or items to consider.
 * -- An agenda user needs to be able to 
 * ------ check if there are any items/tasks on an agenda
 * ------ add tasks/items to an agenda
 * ------ remove tasks/items from an agenda
 * ------ find out how many tasks/items are on an agenda
 * ------ check/read the next item/task without removing it
 * 
 * An Agenda can store any type of Object
 * 
 * The Agenda interface requires five methods to accomplish
 *   the above tasks. Their signatures with descriptions are
 *   provided below.
 * 
 * @author mccauleyr
 * @param <E> the type of object stored
 */
public interface Agenda <E> {

    /**
     * check if there are any items/tasks on an agenda
     * @return true if there are items, false otherwise
     */
    public boolean isEmpty ( );
    
    /**
     * find out how many tasks/items are on an agenda
     * @return the number of items on the list
     */
    public int size ();
    
    /**
     * add tasks/items to an agenda
     * @param item to be added to the agenda
     */
    public void add( E item);
    
    /**
     * remove tasks/items from an agenda
     * @throws Exception 
     */
    public void remove ( ) throws Exception;
    
    /**
     * check/read the next item/task without removing it
     * @return a copy of the item on the list
     */
     public E peek ( ) throws Exception;
    
}
