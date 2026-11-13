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
    public ListNode oddEvenList(ListNode head) {
    List<Integer> l1 = new ArrayList<>();
    ListNode curr = head;
    ListNode curr2 = head;
    int index = 1;
    while(curr!=null){
        if(index%2!=0){
            l1.add(curr.val);
        }
        curr = curr.next;
        index++;
    }
    index=1;
    while(curr2!=null){
        if(index%2==0){
            l1.add(curr2.val);
        }
        curr2 = curr2.next;
        index++;
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