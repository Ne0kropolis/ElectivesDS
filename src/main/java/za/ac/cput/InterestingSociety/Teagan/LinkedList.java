
package za.ac.cput.InterestingSociety.Teagan;

public class LinkedList {
 

    private static class Node {
        private Toys data;
        private Node nextLink;

        public Node(Toys data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Toys data) {
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

    public void addAtHead(Toys data) {
        head = new Node(data, head);
        size++;
    }

    public void addToTail(Toys data) {
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

    Node InsertNth(Toys data, int position) {
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


    public void addSorted(Toys data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getId() > data.getId()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.nextLink.data.getId() < data.getId()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getType() + " " + temp.data.getId() + " ");
            temp = temp.nextLink;
        }
    }


}

