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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        List<Integer> l1 = new ArrayList<>();
        while(curr!=null){
            l1.add(curr.val);
            curr=curr.next;
        }
        int i=0;
        int j=l1.size()-1;
        while(i<l1.size() && j>=0){
            if(i==(k-1) && j==l1.size()-k){
                int temp = l1.get(i);
                l1.set(i,l1.get(j));
                l1.set(j,temp);
                break;
            }
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