
package za.ac.cput.InterestingSociety.Emile;

public class LinkedList {
 

    private static class Node {
        private People data;
        private Node nextLink;

        public Node(People data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(People data) {
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

    public void addAtHead(People data) {
        head = new Node(data, head);
        size++;
    }

    public void addToTail(People data) {
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

    Node InsertNth(People data, int position) {
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


    public void addSorted(People data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getIdentificationNumber() > data.getIdentificationNumber()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.nextLink.data.getIdentificationNumber() < data.getIdentificationNumber()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getIdentificationNumber()+ " " + temp.data.getIdentificationNumber()+ " ");
            temp = temp.nextLink;
        }
    }


}

