package Structures;

public class Stack {

    private Node top = null;
    private int size = 0;

    public Stack() {

    }

    public Stack(Object value) {
        top = new Node(value);
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void push(Object value) {
        Node after = new Node(value);
        if (top != null) {
            top.setNext(after);
            after.setBefore(top);
        }
        top = after;
        size++;
    }

    public Object pop() {
        Node last = top;
        top = top.getBefore();
        size--;
        return last.getValue();
    }

    public Object peek() {
        return top.getValue();
    }
}
