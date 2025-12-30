class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Solution class containing search function
class SearchElement {
    // Function to search for a value in LL
    public static boolean searchValue(Node head, int key) {
        // Pointer to traverse the list
        Node current = head;

        // Traverse until end
        while (current != null) {
            // Check if current node matches key
            if (current.data == key) {
                // Return true if found
                return true;
            }
            // Move to next node
            current = current.next;
        }

        // Return false if not found
        return false;
    }

    public static void main(String[] args) {
        // Creating linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

       

        // Search for value
        if (searchValue(head, 20))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}