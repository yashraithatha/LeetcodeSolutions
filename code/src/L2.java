/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    // TC -> O(n + m), SC -> (n + m)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;
        while(true)
        {
            int v1 = 0, v2 = 0;
            if(l1 != null){
                v1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                v2 = l2.val;
                l2 = l2.next;
            }
            int sum = v1 + v2 + carry;
            int rem = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(rem);
            curr = curr.next;

            if(l1 == null && l2 == null){
                break;
            }
        }

        if(carry != 0){
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}