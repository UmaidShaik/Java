package com.aurionpro.test;

public class CustomLinkedList<T> {
    private Node<T> head;
    
    private static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Add operation
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    // Display operation
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Remove operation
    public boolean remove(T data) {
        if (head == null) {
            return false;
        }
        
        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }
        
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        
        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }
        
        return false;
    }
    
    // Iterate operation
    public void iterate() {
        Node<T> current = head;
        while (current != null) {
            // Perform some action on the current node's data
            // For example: System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        
        linkedList.display(); // Output: 10 -> 20 -> 30 -> null
        
        linkedList.remove(20);
        
        linkedList.display(); // Output: 10 -> 30 -> null
        
        linkedList.iterate(); // You can perform some action on each element during iteration
    }
}

