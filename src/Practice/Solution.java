package Practice;

import java.util.Scanner;

public class Solution {
    private Node head;
    private Node tail;
    int size = 0;
    public static class Node {
        private final int element;
        private Node next;
        private Node prev;

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }

        public int getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev(){
            return prev;
        }

        public void setNext(Node newNode) {
            next = newNode;
        }

        public void setPrev(Node newNode){
            prev = newNode;
        }
    }

    private void printLinkedList() {
        Node node = head;
        while (node != null){
            System.out.println(node.getElement());
            node = node.getNext();
        }
    }

    private void insertNodeToLast(int listItem) {
        Node newNode = new Node(listItem, null);
        if (head == null) head = newNode;
        else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    private void insertNodeToFirst(int listItem) {
        Node newNode = new Node(listItem, null);
        if (head == null) tail = newNode;
        else {
            head.setPrev(newNode);
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Solution solution = new Solution();

        int listCount = scanner.nextInt();
        for (int i = 0; i < listCount; i++) {
            int listItem = scanner.nextInt();
            solution.insertNodeToFirst(listItem);
        }

        solution.printLinkedList();
    }

}
