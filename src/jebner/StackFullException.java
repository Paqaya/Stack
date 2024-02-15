package jebner;

/**
 * An error that happens when trying to add to a full stack.
 */
public class StackFullException extends RuntimeException {
    /**
     * Makes an error with a message that the stack is full.
     */
    public StackFullException() {
        super("Stack ist VOLL! Operation konnte nicht ausgeführt werden.");
    }
}
