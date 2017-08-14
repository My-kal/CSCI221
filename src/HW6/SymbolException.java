package HW6;

public class SymbolException extends Exception {

    /**
     * Constructor
     * Precondition: None
     */

    public SymbolException(){
       this("**Default Message**");
    }

    /**
     * Constructor
     * Precondition: None
     */

    public SymbolException(String message){
        super(message);
    }

}
