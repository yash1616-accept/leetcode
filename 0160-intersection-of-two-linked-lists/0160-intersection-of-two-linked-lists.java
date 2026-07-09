/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       HashSet<ListNode> l = new HashSet<>();
       while(headA!=null){
        l.add(headA);
        headA=headA.next;
       }

       while(headB!=null){
        if(l.contains(headB)){
            break;
        }
        headB= headB.next;
       }
       return headB;
    }
}