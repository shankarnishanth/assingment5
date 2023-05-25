public class Linkedlistmethod {
    Node head;

    public void insertFirst(int data){
        Node node = new Node(data);
        node.setData(data);
        node.setNext(head);
        head = node;

    }

    public void printLinkedlist(){
        Node currentNode = head;
        System.out.println("Elements in Linkedlist");
        while (currentNode != null){
            currentNode.display();
            currentNode = currentNode.next;
        }
    }
}
