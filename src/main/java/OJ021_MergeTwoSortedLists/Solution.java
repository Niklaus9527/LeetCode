package OJ021_MergeTwoSortedLists;

/**
 * Created by zhangyayun on 2017/2/13.
 */

/**
 * Definition for singly-linked list.
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(l1 != null || l2 != null){
            if(l1 == null || (l2 != null && l1.val > l2.val)){
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
            }else{
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            temp = temp.next;
        }
        return result.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
