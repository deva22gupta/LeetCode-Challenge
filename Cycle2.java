


package Prog.LinkedList;
// Java program to return
// first node of loop.
import java.util.*;
public class Cycle2 {

static class Node
{
int key;
Node next;
};

static Node newNode(int key)
{
Node temp = new Node();
temp.key = key;
temp.next = null;
return temp;
}

// A utility function to
// print a linked list
static void printList(Node head)
{
while (head != null)
{
	System.out.print(head.key + " ");
	head = head.next;
}
System.out.println();
}

public static Node detectCycle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast!=null && fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
        
        if (fast == slow){
            Node slow2 = head; 
            while (slow2 != slow){
                slow = slow.next;
                slow2 = slow2.next;
            }
            return slow;
        }
    }
    return null;
}



// Driver code

public static void main(String[] args)
{
Node head = newNode(50);
head.next = newNode(20);
head.next.next = newNode(15);
head.next.next.next = newNode(4);
head.next.next.next.next = newNode(10);

// Create a loop for testing
head.next.next.next.next.next = head.next.next;

Node res = detectCycle(head);
if (res == null)
	System.out.print("Loop does not exist");
else
	System.out.print("Loop starting node is " + res.key);
}
}

// This code is contributed by shikhasingrajput
