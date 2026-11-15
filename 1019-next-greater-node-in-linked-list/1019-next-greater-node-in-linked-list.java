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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        List<Integer> l1 = new ArrayList<>();
        while(curr!=null){
            l1.add(curr.val);
            curr = curr.next;
        }
        int[] arr = new int[l1.size()];
        int k=0;
        for(int i=0;i<arr.length;i++){
            int next = 0;
            for(int j=i+1;j<arr.length;j++){
                if(l1.get(j)>l1.get(i)){
                    next = l1.get(j);
                    break;
                }
            }
            arr[k] = next;
            k++;
        }
       return arr;
    }
}