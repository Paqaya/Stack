package jebner;

/**
 * A stack class for storing items. It can grow up to a fixed size.
 */
public class Stack<P_TALK> {
    private Object[] array;

    /**
     * Makes a stack with space for 10 items.
     */
    public Stack() {
        array = new Object[10];
    }

    /**
     * Makes a stack with space for a given number of items.
     * @param l number of items it can hold
     */
    public Stack(int l) {
        array = new Object[l];
    }

    /**
     * Gets the items in the stack.
     * @return the items
     */
    public Object[] getArray() {
        return array;
    }

    /**
     * Replaces the stack's items with new ones.
     * @param array new items
     */
    public void setArray(P_TALK[] array) {
        this.array = array;
    }

    /**
     * Adds an item on top of the stack.
     * @param P the item to add
     * @return true if added, or an error if full
     */
    public boolean push(P_TALK P) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                array[i] = P;
                return true;
            }
        }
        throw new StackFullException();
    }

    /**
     * Removes and returns the top item.
     * @return the top item, or an error if empty
     */
    public P_TALK pop() {
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] != null) {
                P_TALK item = (P_TALK) array[i];
                array[i] = null;
                return item;
            }
        }
        throw new StackEmptyException();
    }

    /**
     * Shows the top item without removing it.
     * @return the top item, or an error if empty
     */
    public P_TALK peek() {
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] != null) {
                return (P_TALK) array[i];
            }
        }
        throw new StackEmptyException();
    }

    /**
     * Lists all items.
     * @return a string of items, or an error if empty
     */
    public String list() {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                str += array[i].toString() + ";";
            }
        }
        if(str.isEmpty()) throw new StackEmptyException();
        else return str.substring(0, str.length() - 1);
    }
}
