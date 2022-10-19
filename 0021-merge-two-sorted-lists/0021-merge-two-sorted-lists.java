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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = null, t1=list1, t2=list2, cur=null;
        
        if(t1==null){
            return t2;
        }else if(t2==null){
            return t1;
        }
        
        if(t1.val < t2.val){
            head = t1;
            cur = head;
            t1 = t1.next;
        }
        else{
            head = t2;
            cur = head;
            t2 = t2.next;
        }
        
        
        while(t1!=null && t2!=null)
        {
            System.out.println(t1.val);
            if(t1.val<t2.val){
                cur.next = t1;
                t1 = t1.next;
                cur = cur.next;
            }
            else{
                cur.next = t2;
                t2 = t2.next;
                cur = cur.next;
            }
        }
        
        cur.next = t1!=null ? t1 : t2;
        
        return head;
        
    }
}