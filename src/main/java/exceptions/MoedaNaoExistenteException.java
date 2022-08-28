package exceptions;

public class MoedaNaoExistenteException extends Throwable {
    private String message;

    public MoedaNaoExistenteException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
