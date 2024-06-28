package Hw22;

import java.util.Iterator;

public class SingleWayList<T> implements Iterable<T> {

    private Node<T> head; //null
    private Node<T> tail;
    private int size = 0;

    public T getTail() {
        return tail.data;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        private Node<T> current = head;


        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next(){
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void add(T data){

        Node<T> newNode = new Node<T>(data);
        Node<T> l = tail;
        tail = newNode;
        if (l == null){
            head = newNode;
        } else {
            l.next = newNode;
        }
        size++;

    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
            size--;
        }
    }

    public void removeLast() {

        Node<T> temp = head;
        Node<T> temp2 = head.next;
        while(temp != null && temp2 != null) {
            if(temp2.next == null) {
                tail = temp;
                temp.next = null;
            }
            temp2 = temp2.next;
            temp = temp.next;
        }

        if(head.next == null)
            tail = head;

        size--;

    }

    public void printList(){
        Node<T> current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public T get(int index){
        if (index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i=0; i < index; i++){
            if (current == null){
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }
        return current.data;
    }

    public int getSize(){
        return size;
    }

    public void setValue(int index, T data){
        if (index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i=0; i < index; i++){
            if (current == null){
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }
        current.data = data;
    }

}
