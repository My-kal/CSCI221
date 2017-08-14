package HW7;

/**
 * Created by mykalburris on 11/29/16.
 */
public class EmptyStackException extends Exception {
    /**
     * Constructor
     * Precondition: None
     */
    public EmptyStackException(){
        this("**Stack is empty**");
    }

    /**
     * /**
     * Constructor
     * Precondition: None
     * @param message
     */
    private EmptyStackException(String message){
        super(message);
    }
}
