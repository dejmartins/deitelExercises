package DataStructures.LinkedLists;

public class CircularlyLinkedList<E> {

    public void rotate() {
        if (!isEmpty()) tail = tail.getNext();
    }

    public static class Node<E> {

        private E element;

        private Node<E> next;
        public Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


    private Node<E> tail;

    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E country) {
        if (isEmpty()) {
            tail = new Node<>(country, null);
            tail.setNext(tail);
        }
        else {
            Node<E> newest = new Node<>(country, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E country) {
        addFirst(country);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> first = tail.getNext();
        tail.setNext(first.getNext());
        size--;
        return first.getElement();
    }

    public E first() {
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public int size() {
        return size;
    }

}
