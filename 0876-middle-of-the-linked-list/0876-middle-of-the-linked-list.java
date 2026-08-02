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
    public ListNode middleNode(ListNode head) {
        
        int cnt = 0;
        ListNode temp = new ListNode();

        temp = head;
        while(temp != null){
            cnt = cnt+1;
            temp = temp.next;
        }

        int middle;

        if (cnt % 2 == 1){
            middle = (cnt / 2) + 1;
        }
        else{
            middle = (cnt / 2) + 1;
        }

        temp = head;
        for(int i = 1; i < middle; i++){
            temp= temp.next;
        }

        return temp;
    }
}