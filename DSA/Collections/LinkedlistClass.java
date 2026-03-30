
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    // Inserting at begining
    public void insertAtbegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
    }

        // Deleting a node

        // Disply LL

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("Null");
}    
}

public class LinkedlistClass {
    public static void main(String[] args) {
        LinkedList List1 = new LinkedList();
        List1.insertAtEnd(10);
        List1.insertAtEnd(20);
        List1.insertAtEnd(30);
        List1.insertAtEnd(40);
        List1.insertAtEnd(50);
        List1.insertAtEnd(60);
        List1.display();
    }
}
