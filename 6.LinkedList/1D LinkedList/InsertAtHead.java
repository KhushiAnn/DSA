class Node {
    int data;    
    Node next;   

    // Constructor with data and next pointer
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    Node(int data1) {
        data = data1;
        next = null;
    }
}

// Solution class to handle linked list operations
class InsertAtHead {
    // Function to insert a new node at the head
    public static Node insertAtHead(Node head, int newData) {
        // Create a new node whose next points to current head
        Node newNode = new Node(newData, head);
        // Return the new node as the head
        return newNode;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        

        // Creating a sample linked list: 2 -> 3
        Node head = new Node(2);
        head.next = new Node(3);

        System.out.print("Original List: ");
        printList(head);

        // Inserting new node at head
        head = insertAtHead(head, 1);

        System.out.print("After Insertion at Head: ");
        printList(head);
    }
}