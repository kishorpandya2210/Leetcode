# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        copy = answer = ListNode(0)
        carry=0
        
        while l1 and l2:
            s=l1.val + l2.val + carry
            copy.next = ListNode(int(s%10))
            carry = int(s/10)
            copy = copy.next
            l1=l1.next
            l2=l2.next
        
        while l1:
            s=l1.val + carry
            copy.next = ListNode(int(s%10))
            carry = int(s/10)
            copy = copy.next
            l1=l1.next
            
        while l2:
            s=l2.val + carry
            copy.next = ListNode(int(s%10))
            carry = int(s/10)
            copy = copy.next
            l2=l2.next
        
        if(carry!=0):
            copy.next = ListNode(carry)
        
        return answer.next