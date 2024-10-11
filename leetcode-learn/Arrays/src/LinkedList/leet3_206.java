package LinkedList;

public class leet3_206 {
    public static void main(String[] args) {

    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
    }

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
    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode cur = head;
            ListNode pred = null;
            while(cur != null) {
                ListNode temp = cur.next;
                cur.next = pred;
                pred = cur;
                cur = temp;
            }
            return pred;

        }
    }

    static class Solution2 {
        public ListNode reverseList(ListNode head) {
            return reverse(head, null);
        }

        public ListNode reverse(ListNode cur, ListNode pred) {
            if(cur == null) {
                return pred;
            }
            ListNode temp = cur.next;
            cur.next = pred;
            return reverse(temp, cur);
        }
    }
}

