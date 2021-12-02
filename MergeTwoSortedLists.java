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
    ListNode answer = new ListNode(0);
    ListNode ans = answer;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ans.next = new ListNode(list1.val);
                ans = ans.next;
                return mergeTwoLists(list1.next, list2);
            }
            else{
                ans.next = new ListNode(list2.val);
                ans = ans.next;
                return mergeTwoLists(list1, list2.next);
            }
        }
        else if(list2==null && list1!=null){
            ans.next = new ListNode(list1.val);
            ans = ans.next;
            return mergeTwoLists(list1.next, list2);
        }
        else if(list1==null && list2!=null){
            ans.next = new ListNode(list2.val);
            ans = ans.next;
            return mergeTwoLists(list1, list2.next);
        }
        return answer.next;
    }
}