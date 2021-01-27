package exceptionclass.bank;

public class InvalidBankOperationException extends RuntimeException{
    ErrorCode ec;

    public InvalidBankOperationException(ErrorCode ec) {
        this.ec = ec;
    }

    public InvalidBankOperationException(String message, ErrorCode ec) {
        super(message);
        this.ec = ec;
    }

    public ErrorCode getEc() {
        return ec;
    }
}
