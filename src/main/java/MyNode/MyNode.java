package MyNode;

import org.w3c.dom.Node;

public class MyNode {

    public int data;
    public MyNode next;
    public MyNode prev;

    public MyNode() {
    }

    public MyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void add(int data) {
        MyNode newNode = new MyNode(data);
        MyNode current = this;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public String print() {
        String nextValue = (next != null) ? String.valueOf(next.data) : "null";
        String prevValue = (prev != null) ? String.valueOf(prev.data) : "null";
        return "Node { value = " + data + ", next = " + nextValue + ", prev = " + prevValue + " }";
    }

}






