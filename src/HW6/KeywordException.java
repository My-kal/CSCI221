package HW6;

public class KeywordException extends Exception {
    /**
     * Constructor
     * Precondition: None
     */
    public KeywordException(){
        this("**Keyword Not Found**");
    }

    /**
     * /**
     * Constructor
     * Precondition: None
     * @param message
     */
    private KeywordException(String message){
        super(message);
    }
}
