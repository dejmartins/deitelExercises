package DataStructures.LinkedLists;

public class SinglyLinkedList<E> implements Cloneable{

    private static class Node<E>{

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
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList(){

    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void addFirst(E name) {
        head = new Node<>(name, head);
        if(size == 0){
            tail = head;
        }
        size++;
    }

    public void addLast(E name) {
        Node<E> newTail = new Node<>(name, null);
        if(size == 0){
            head = newTail;
        } else tail.setNext(newTail);
        tail = newTail;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E element = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0){
            tail = null;
        }
        return element;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public int size() {
        return size;
    }

    @Override
    public SinglyLinkedList<E> clone() {
        try {
            SinglyLinkedList<E> clone = (SinglyLinkedList<E>) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            if (size > 0){
                clone.head = new Node<>(head.getElement(), null);
                Node<E> walk = head.getNext();
                Node<E> cloneTail = clone.head;

                while(walk != null){
                    Node<E> newest = new Node<>(walk.getElement(), null);
                    cloneTail.setNext(newest);
                    cloneTail = newest;
                    walk = head.getNext();
                }
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }




}
