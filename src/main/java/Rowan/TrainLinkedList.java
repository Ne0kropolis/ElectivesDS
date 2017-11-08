/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rowan;


/**
 *
 * @author dajew
 */
public class TrainLinkedList {
    
    private static class Node {
        private Train data;
        private Node nextLink;

        public Node(Train data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Train data) {
            this.data = data;
            this.nextLink = null;
        }
    }

    private Node head;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addAtHead(Train data) {
        head = new Node(data, head);
        size++;
    }

    public void addToTail(Train data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (head == null) {
            head = newNode;
        }
        else{
            while (curr.nextLink != null) {
                curr = curr.nextLink;
            }
            curr.nextLink = newNode;
        }
    }

    
    Node InsertNth(Train data, int position) {
        Node node = head;
        if (position == 0) {
            node = new Node(data, head);
            return node;
        } else {
            while (--position > 0) {
                node = node.nextLink;
            }
            Node next = node.nextLink;
            node.nextLink = new Node(data, next);
            return head;
        }
    }


    public void addSorted(Train data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getTrainID() > data.getTrainID()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.nextLink.data.getTrainID() < data.getTrainID()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getTrainModel()+ " " + temp.data.getTrainID()+ " "+ temp.data.getTrainAvailable());
            temp = temp.nextLink;
        }
    }
}
