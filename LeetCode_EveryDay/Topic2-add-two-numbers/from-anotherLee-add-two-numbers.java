/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2;
        ListNode h = new ListNode(0);
        ListNode cur = h;
        int flag = 0;//进位
        while(p!=null||q!=null){//就不把链更长的分出来讨论
            int pVal = p==null?0:p.val;
            int qVal = q==null?0:q.val;
            int tmp = pVal+qVal+flag;
            flag = tmp>=10 ? 1 : 0;
            cur.val = tmp%10;
            p = p==null? null : p.next;
            q = q==null? null : q.next;
            if(p!=null||q!=null){
                cur.next = new ListNode(0);
                cur = cur.next;
            }
        }
        if(flag==1){
            cur.next = new ListNode(1);
        }
        return h;
    }
}