package za.ac.cput.InterestingSociety.Jack;

/**
 *
 * @author Jack Forde
 * @std 216238684
 *
 */

public class MyLinkedList {

    private static class Node {
        private Pilot data;
        private Node nextLink;

        public Node(Pilot data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Pilot data) {
            this.data = data;
            this.nextLink = null;
        }
    }

    private Node head; // sometimes called top
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Node Insertion in a Linked List
    // 1. Insert	element	at	the	start

    public void addAtHead(Pilot data) {
        head = new Node(data, head);
        size++;
    }

    // 2. Insert	element	at	the	end
    public void addToTail(Pilot data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (head == null)
            head = newNode;

        while (curr.nextLink != null) {
            curr = curr.nextLink;
        }
        curr.nextLink = newNode;

    }
    // 3. Insert	of	an	element	at	the	Nth position

    Node InsertNth(Pilot data, int position) {
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


    // 3. Insert	element	in	sorted	order

    public void addSorted(Pilot data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getCallsign().compareTo(data.getCallsign()) > 0) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.data.getCallsign().compareTo(data.getCallsign()) < 0) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }

    // TRAVERSE A LINKED LIST

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getfName() + ", " + temp.data.getlName() + ", " + temp.data.getCallsign() + ", ");
            temp = temp.nextLink;
        }
    }


}
