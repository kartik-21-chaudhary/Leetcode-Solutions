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
    public ListNode insertGreatestCommonDivisors(ListNode head){
        ListNode curr = head;
        List<Integer> l1 = new ArrayList<>();
        while(curr!=null){
            l1.add(curr.val);
            curr = curr.next;
        }
        int i=0;
        while(i+1<l1.size()){
            l1.add(i+1,gcd(l1.get(i),l1.get(i+1)));
            i+=2;
        }
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for(int x:l1){
            tail.next = new ListNode(x);
            tail = tail.next;
        }
        return dummy.next;
    }
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}