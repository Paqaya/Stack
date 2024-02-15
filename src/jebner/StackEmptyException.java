package jebner;

/**
 * An error for when an operation can't be done because the stack is empty.
 */
public class StackEmptyException extends RuntimeException {
    /**
     * Sets up an error message saying the stack is empty.
     */
    public StackEmptyException() {
        super("Stack ist LEER! Operation konnte nicht ausgeführt werden.");
    }
}
