// Node class represents a node in a linked list
class Node {
    // Data stored in the node
    int data;

    // Pointer to the next node
    Node next;

    // Constructor with both data and next node
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

// Solution class containing the loop length function
class LengthOfLoop {
    // Function to return the length of loop using Floyd's Algorithm
    public static int lengthOfLoop(Node head) {
        // Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;

        // Loop until fast and slow meet
        while (fast != null && fast.next != null) {
            // Move slow by one step
            slow = slow.next;

            // Move fast by two steps
            fast = fast.next.next;

            // If slow and fast meet, loop detected
            if (slow == fast) {
                // Count the length of the loop
                return countLoopLength(slow);
            }
        }

        // No loop found
        return 0;
    }

    // Function to count loop length
    public static int countLoopLength(Node meetingPoint) {
        // Start from meeting point
        Node temp = meetingPoint;
        int length = 1;

        // Move until we meet again
        while (temp.next != meetingPoint) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        // Creating a sample linked list with a loop
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a loop from fifth to second
        fifth.next = second;

        // Getting the loop length
        int loopLength = lengthOfLoop(head);

        // Printing the result
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}