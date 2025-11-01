class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node before head to handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move first pointer n+1 steps ahead so gap between first and second is n
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Move both until first reaches end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // Now, second.next is the node to delete
        second.next = second.next.next;
        
        // Return the new head
        return dummy.next;
    }
}
