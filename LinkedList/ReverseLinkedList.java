public class ReverseLinkedList {
    // Node class representing each element of the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to reverse the linked list
    static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    // Method to create a linked list from an array of integers
    static Node createLinkedList(int[] arr) {
        Node head = null;
        Node tail = null;
        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Creating a sample linked list using createLinkedList method
        int[] arr = {1, 2, 3, 4, 5};
        Node head = createLinkedList(arr);

        System.out.println("Original linked list:");
        printList(head);

        // Reversing the linked list
        head = reverseLinkedList(head);

        System.out.println("Reversed linked list:");
        printList(head);
    }
}
