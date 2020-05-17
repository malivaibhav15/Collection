package com.BridgeLabz;

public class Node {
    int data;
    Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


class LinkedList {
    int size;
    Node start;

    public LinkedList() {
    }

    public LinkedList(int size, Node start) {
        this.size = size;
        this.start = start;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void viewList() {
        Node node;
        if (isEmpty())
            System.out.println("List is Empty");
        else {
            node = start;
            for (int index = 1; index <= size; index++) {
                System.out.println(" " + node.getData());
                node = node.getNext();
            }
        }
    }

    public int getListSize() {
        return size;
    }

    public void insertAtFirst(int value) {
        Node node = new Node();
        node.setData(value);
        node.setNext(start);
        size++;
    }

    public void insertAtLast(int value) {
        Node node;
        Node node1 = new Node();
        node = start;
        if (node == null)
            start = node1;
        else {
            while (node.getNext() != null) {
                node = node.getNext();
                node.setNext(node1);
            }
            size++;
        }
    }

    public void insertAtPosition(int value, int position) {
        if (position == 1)
            insertAtFirst(value);
        else if (position == size + 1)
            insertAtLast(value);
        else if (position > 1 && position <= size) {
            Node node, temp;
            node = new Node(value, null);
            temp = start;
            for (int index = 0; index < size - 1; index++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
            size++;
        }
    }

    public void deleteAtFirst() {
        if (start == null)
            System.out.println("List Is Empty");
        else {
            start = start.getNext();
            size--;
        }
    }

    public void deleteAtLast() {
        if (start == null)
            System.out.println("List Is Empty");
        else if (size == 1) {
            start = null;
            size--;
        } else {
            Node node;
            node = start;
            for (int index = 1; index < size - 1; index++) {
                node = node.getNext();
            }
            node.setNext(null);
            size--;
        }
    }

    public void deleteAtPosition(int position) {
        if (start == null)
            System.out.println("List Is Empty");
        else if (position < 1 || position > size)
            System.out.println("Invalid Postion");
        else if (position == 1)
            deleteAtFirst();
        else if (position == size)
            deleteAtLast();
        else {
            Node temp, node;
            temp = start;
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            node = temp.getNext();
            temp.setNext(node.getNext());
            size--;
        }
    }
}

class Main
{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtFirst(10);
        linkedList.insertAtLast(100);
        linkedList.insertAtPosition(20, 2);
        linkedList.deleteAtFirst();
        linkedList.deleteAtLast();
        linkedList.deleteAtPosition(2);
        linkedList.viewList();
        linkedList.getListSize();
    }
}