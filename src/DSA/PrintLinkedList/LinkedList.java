package DSA.PrintLinkedList;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    int size = 0;

    public E getHead() {
        if (size == 0) return null;
        return head.getElement();
    }

    public void addToLast(Node<E> newNode) {
        if (head == null) head = newNode;
        else head.setNext(newNode);
        tail = newNode;
        size++;
    }

    public E getTail() {
        return tail.getElement();
    }

    public String getAllElements() {
        String all = "";
        Node<E> node = head;
        while (node.getNext() != null){
            all += node.getElement();
            node = node.getNext();
            all += " ";
        }
        return all;
    }


}
