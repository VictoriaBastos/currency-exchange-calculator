package exceptions;

public class ValorNegativoException extends Throwable {
    private String message;

    public ValorNegativoException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
