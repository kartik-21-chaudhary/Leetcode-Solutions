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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> l1 = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            l1.add(curr.val);
            curr=curr.next;
        }
        int i=left-1;
        int j=right-1;
        while(i<j){
            int temp = l1.get(i);
            l1.set(i,l1.get(j));
            l1.set(j,temp);
            i++;
          j--;
        }
       

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for(int x:l1){
            tail.next = new ListNode(x);
            tail = tail.next;
        }
        return dummy.next;
    }
}