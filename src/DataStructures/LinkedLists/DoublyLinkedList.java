package DataStructures.LinkedLists;

public class DoublyLinkedList<E> {

    public static class Node<E> {
        private Node<E> previous;
        private final E element;
        private Node<E> next;


        public Node(Node<E> previous, E element, Node<E> next){
            this.previous = previous;
            this.element = element;
            this.next = next;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }
    }

    Node<E> header;
    Node<E> trailer;
    int size;

    public DoublyLinkedList(){
        header = new Node<>(null, null, null);
        trailer = new Node<>(header, null, null);
        header.setNext(trailer);
    }

    public E first() {
        return header.getNext().getElement();
    }

    public int size() {
        return size;
    }

    public void addFirst(E meal) {
        addBetween(header, meal, header.getNext());
    }

    public void addLast(E meal) {
        addBetween(trailer.getPrevious(), meal, trailer);
    }

    private void addBetween(Node<E> predecessor, E element, Node<E> successor){
        Node<E> newest = new Node<>(predecessor, element, successor);
        predecessor.setNext(newest);
        successor.setPrevious(newest);
        size++;
    }

    public E removeFirst() {
        return remove(header.getNext());
    }

    public E removeLAst() {
        return remove(trailer.getPrevious());
    }

    private E remove(Node<E> node){
        if (isEmpty()) return null;
        Node<E> predecessor = node.getPrevious();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrevious(predecessor);
        size--;
        return node.getElement();
    }

    public E last() {
        return trailer.getPrevious().getElement();
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
