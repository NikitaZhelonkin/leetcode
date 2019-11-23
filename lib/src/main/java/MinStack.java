public class MinStack {

    private Node top;

    public MinStack() {

    }

    public void push(int x) {
        Node lastTop = top;
        top = new Node(x);
        top.minValue = lastTop == null ? x : Math.min(x, lastTop.minValue);
        top.next = lastTop;
    }

    public void pop() {
        if (top == null) throw new IllegalStateException();
        top = top.next;

    }

    public int top() {
        if (top == null) throw new IllegalStateException();
        return top.val;
    }

    public int getMin() {
        return top.minValue;
    }

    private class Node {
        int val;
        Node next;
        int minValue;

        public Node(int val) {
            this.val = val;
        }
    }
}
