package collectionsqueue.job;

public class NoJobException extends Exception{
    private String message;

    public NoJobException(String str) {
        this.message = str;
    }

    public String getMessage() {
        return message;
    }
}
