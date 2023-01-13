import java.util.HashSet;

public class LLCycle_FE {
    public static void main(String[] args) {
        Node head = buildLL();
        // Given the above linked list write the 2 methods below (removeDuplicates and showLL)
        System.out.printf("\n  --------- ");
        // This method will remove any duplicate LL nodes (that is, with the same color)
        head = removeDuplicates( head );
        // This method will show the LL
        showLL( head );

    }

    public static Node removeDuplicates(Node head) {
        // Create a new HashSet to store the unique colors that have been encountered in the linked list
        HashSet<String> uniqueColors = new HashSet<>();
        // Start at the head of the linked list
        Node currentNode = head;
        // Keep track of the previous node in the linked list
        Node previousNode = null;
        // Iterate through the linked list
        while (currentNode != null) {
            // Check if the current node's color has been encountered before
            if (uniqueColors.contains(currentNode.color)) {
                // If the color has been encountered before, remove the current node from the linked list
                previousNode.next = currentNode.next;
            } else {
                // If the color has not been encountered before, add it to the HashSet and move on to the next node
                uniqueColors.add(currentNode.color);
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        // Return the head of the linked list
        return head;
    }





    private static void showLL(Node head) {
        // Start at the head of the linked list
        Node currentNode = head;
        // Iterate through the linked list
        while (currentNode != null) {
            // Print the color of the current node
            System.out.println(currentNode.color);
            // Move on to the next node in the linked list
            currentNode = currentNode.next;
        }
    }

    private static Node buildLL() {
        // Use this code to create your LL
        Node head = new Node("Red", null);
        Node n2 = new Node("Blue", null);
        head.next = n2;
        Node n3 = new Node("Green", null);
        n2.next = n3;
        Node n4 = new Node("Yellow", null);
        n3.next = n4;
        Node n5 = new Node("Blue", null );
        n4.next = n5;
        Node n6 = new Node("Yellow", null );
        n5.next = n6;
        return head;
    }
    public static class Node {
        // Used this Node for a LL node
        public String color;
        public Node next;

        public Node(String color, Node next) {
            this.color = color;
            this.next = next;
        }
    }
}

