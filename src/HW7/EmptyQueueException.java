package HW7;

/**
 * Created by mykalburris on 11/30/16.
 */
public class EmptyQueueException extends Exception{

    /**
     * Constructor
     * Precondition: None
     */
    public EmptyQueueException(){
        this("**Queue is empty**");
    }

    /**
     * /**
     * Constructor
     * Precondition: None
     * @param message
     */
    private EmptyQueueException(String message){
        super(message);
    }

}
