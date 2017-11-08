
package za.ac.cput.InterestingSociety.Emile;

/**
 *
 * @author Emile De Klerk
 * @std 214172430
 */
public class DoublyLinkedList {
    
    private static class Node {
    
        private People data;
        private Node nextLink;
        private Node prevLink;
        
        
        public Node(People data, Node nextLink, Node prevLink) {
            
            this.data = data;
            this.nextLink = nextLink;
            this.prevLink = prevLink;
        }
        
        public Node(People data) {
            this.data = data;
            this.nextLink = null;
            this.prevLink = null;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;
    
    public int size() {
        return (this.size);
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public void insertAfter(People data) {
        if (this.head == null && this.tail == null) {
            Node newNode = new Node(data);
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            Node newNode = new Node(data, null, this.tail);
            tail.nextLink = newNode;
            this.tail = newNode;
        }
        
    }
    
    public void insertBefore (People data){
        if (this.head == null && this.tail == null ) {
            Node newNode = new Node(data);
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            Node newNode = new Node(data, this.head, null);
            head.prevLink = newNode;
            this.head = newNode;
        }
        
    }
    
    public void insertNth(People data, int pos) {
        
        if (pos == 0) {
            Node newNode = new Node(data);
            this.head = newNode;
            this.tail = newNode;
        }
        
        else {
            Node node = this.head;
            while (--pos > 0) {
                node = node.nextLink;
            }
            Node newNode = new Node(data, node.nextLink, node);
            node.nextLink.prevLink = newNode;
            node.nextLink = newNode;
        }
        
    }
    
    public void addAscending(People data) {
        Node newNode = new Node(data);
        Node curr = this.head;
        
        if (curr.nextLink == null || curr.data.getName() > data.getName() ) {
            newNode.nextLink = head;
            curr.prevLink = newNode;
            this.head = newNode;
            
        }
        else{
            
            while (curr.nextLink != null && curr.data.getIdentificationNumber() < data.getIdentificationNumber()) {
                curr = curr.nextLink;
            }
            
            newNode.nextLink = curr.nextLink;
            newNode.prevLink = curr;
            if (curr.nextLink == null) {
                this.tail = newNode;
            }
            else{
                curr.nextLink.prevLink = newNode;
            }
            curr.nextLink = newNode;
        }
    }
    
    public void addDescending(People data) {
        Node newNode = new Node(data);
        Node curr = this.head;
        
        if (curr.nextLink == null || curr.data.getName() < data.getName() ) {
            newNode.nextLink = head;
            curr.prevLink = newNode;
            this.head = newNode;
        }
        else{
            
            while (curr.nextLink != null && curr.data.getIdentificationNumber() > data.getIdentificationNumber()) {
                curr = curr.nextLink;
            }
            
            newNode.nextLink = curr.nextLink;
            newNode.prevLink = curr;
            if (curr.nextLink == null) {
                this.tail = newNode;
            }
            else{
                curr.nextLink.prevLink = newNode;
            }
            curr.nextLink = newNode;
        }
    }
    
    public void printForward() {
        Node curr = this.head;
        while (curr != null) {
            System.out.println(curr.data.toString());
            curr = curr.nextLink;
        }
    }
    
    public void printBackward(){
        Node curr = this.tail;
        while (curr != null) {
            System.out.println(curr.data.toString());
            curr = curr.prevLink;
        }
    }
}
