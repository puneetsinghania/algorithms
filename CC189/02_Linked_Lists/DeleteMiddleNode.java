/**
 *
 * 2.3 Delete Middle Node
 *     Implement an algorithm to delete a node in the middle (i.e., any node but the
 *     first and last node, not necessarily the exact middle) of a singly linked list,
 *     given only access to that node.
 *     EXAMPLE
 *     Input: that node c from the linked list a->b->c->d->e->f
 *     Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 *
 */
class DeleteMiddleNode {
    public static boolean deleteMiddle(Node n) {
        if (n == null || n.next == null) {
            return false;
        }
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }
    
	public static void main(String[] args) {
		Node head = new Node(1);
        head.appendTail(head, 2);
        head.appendTail(head, 2);
        head.appendTail(head, 3);
        head.appendTail(head, 4);
        head.appendTail(head, 5);
        head.appendTail(head, 5);
        head.appendTail(head, 1);
        head.appendTail(head, 7);
        head.appendTail(head, 7);
        
        head.printList();
        deleteMiddle(head.next);
        head.printList();
        deleteMiddle(head.next);
        head.printList();
        deleteMiddle(head.next);
        head.printList();
        deleteMiddle(head.next);
        head.printList();
        deleteMiddle(head.next);
        head.printList();
        deleteMiddle(head.next);
        head.printList();
        deleteMiddle(head.next);
        head.printList();
        deleteMiddle(head.next);
        head.printList();
	}
}