import javax.xml.soap.Node;

public class BicycleLinkedList
{
    private static class Node {
        private Node nextLink;
        private final Bicycle data;
        private int vinNum;
        private String color;

        public Node(Bicycle data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Bicycle data) {
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

    public void addAtHead(Bicycle data) {
        head = new Node(data, head);
        size++;
    }

    public void addToTail(Bicycle data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (head == null) {
            head = newNode;
        } else{
            while (curr.nextLink != null) {
                curr = curr.nextLink;
            }
            curr.nextLink = newNode;
        }
    }

    Node InsertNth(Bicycle data, int position) {
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

    public void addSorted(Bicycle data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getVinNum() > data.getVinNum()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.nextLink.data.getVinNum() < data.getVinNum()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getVinNum() + " " + temp.data.getColor() + " ");
            temp = temp.nextLink;
        }
    }


}



