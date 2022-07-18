/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        PriorityQueue<ListNode> heap = new PriorityQueue<>((x,y)-> x.val-y.val);
        if (lists.length==0) return res.next;
        for(ListNode list:lists){
            if (list!=null)
            heap.add(list);
        }
        
        while(!heap.isEmpty()){
            ListNode node = heap.poll();
            res.next = node;
            res = res.next;
            if(node.next!=null)
                heap.add(node.next);
        }
        res.next = null;
        
        return head.next;
    }
}