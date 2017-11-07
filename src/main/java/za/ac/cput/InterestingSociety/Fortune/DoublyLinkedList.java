
package za.ac.cput.InterestingSociety.Fortune;

/**
 *
 * @author Fortune Dederen
 * @std 216177758
 */
public class DoublyLinkedList {
    
    private static class Node {
    
        private Product data;
        private Node nextLink;
        private Node prevLink;
        
        
        public Node(Product data, Node nextLink, Node prevLink) {
            
            this.data = data;
            this.nextLink = nextLink;
            this.prevLink = prevLink;
        }
        
        public Node(Product data) {
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
    
    public void insertAfter(Product data) {
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
    
    public void insertBefore (Product data){
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
    
    public void insertNth(Product data, int pos) {
        
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
    
    public void addAscending(Product data) {
        Node newNode = new Node(data);
        Node curr = this.head;
        
        if (curr.nextLink == null || curr.data.getProductCode() > data.getProductCode() ) {
            newNode.nextLink = head;
            curr.prevLink = newNode;
            this.head = newNode;
            
        }
        else{
            
            while (curr.nextLink != null && curr.data.getProductCode() < data.getProductCode()) {
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
    
    public void addDescending(Product data) {
        Node newNode = new Node(data);
        Node curr = this.head;
        
        if (curr.nextLink == null || curr.data.getProductCode() < data.getProductCode() ) {
            newNode.nextLink = head;
            curr.prevLink = newNode;
            this.head = newNode;
        }
        else{
            
            while (curr.nextLink != null && curr.data.getProductCode() > data.getProductCode()) {
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
