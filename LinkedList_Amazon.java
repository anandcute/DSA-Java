
// Using floyd's cycle Alogrithm

class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class LinkedList_Amazon {

    // cycle iruka ilaya nu return pananum

    public boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow != fast)
              return true;
        }
        return false;
    }


    // Method to detect the start of the cycle(Cycle begin )
    public Node detectCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        // Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Cycle detected
            if (slow == fast) {
                
                // Find the start of the cycle
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
        
                return slow; // or fast, both are at the start of the cycle
            }
        }
        return null;
    }

    // Helper method to create a cycle in the linked list
    public void createCycle(Node head, int pos) {
        if (pos == -1) return;

        Node tail = head;
        Node cycleNode = null;
        int index = 0;

        while (tail.next != null) {
            if (index == pos) {
                cycleNode = tail;
            }
            tail = tail.next;
            index++;
        }

        // Create a cycle
        tail.next = cycleNode;
       
    }


    public static void main(String[] args) {
        LinkedList_Amazon list = new LinkedList_Amazon();
       // Example 1: Input: head = [3,2,0,-4], pos = 1
       Node head1 = new Node(3);
       head1.next = new Node(2);
       head1.next.next = new Node(0);
       head1.next.next.next = new Node(-4);

       list.createCycle(head1, 1);  // Creating a cycle at index 1
       System.out.println(list.hasCycle(head1));

       Node cycleNode1 = list.detectCycle(head1);

       if (cycleNode1 != null) {
           System.out.println("Output: tail connects to node index " + cycleNode1.data);
       } else {
           System.out.println("Output: no cycle detected");
       }
    }
    
}