package Lab7;

/**
 * 
 * @author Lab 7 Lab7.HW5.Person class
 * 
 * This class simply models a person that only 
 * has a name. Not a very realistic person - but 
 * good enough for this example :)
 *
 */
public class Person {
    
    // instance variable
    private String name = "Unknown";

 
    /**
     * Constructor
     * 
     * @param initialName
     */
    public Person(String initialName) {
        
        setName( initialName );
        
    } // end constructor

    /**
     * Sets the name of the Lab7.HW5.Person
     * @param newName
     */
    public void setName(String newName) {
        
        if ( newName != null ) {
        
            name = newName;
        
        }
        
    } // end setName() method

    /**
     * Returns the name of the Lab7.HW5.Person
     * @return
     */
    public String getName() {
        
        return name;
        
    } // end getName() method

    /**
     * Prints out the name of the Lab7.HW5.Person with the label Lab7.HW5.Person Name
     */
    public void display() {
        
        System.out.println("Lab7.HW5.Person Name: " + name);
        
    } // end display() method

    /**
     * Returns true if two Lab7.HW5.Person objects have the same name
     * @param otherPerson
     * @return
     */
    public boolean equals(Person otherPerson) {
        
        return otherPerson.getName().equalsIgnoreCase( getName() );
       
    } // end equals() method

} // end Lab7.HW5.Person class definition