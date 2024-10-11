package LinkedList;

public class Leet4_24 {
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
        public ListNode swapPairs(ListNode head) {
            ListNode dummyhead = new ListNode();
            dummyhead.next = head;
            ListNode cur = dummyhead;
            while (cur.next != null && cur.next.next != null) {
                ListNode temp = cur.next;
                ListNode temp1 = cur.next.next.next;
                cur.next = cur.next.next;
                cur.next.next = temp;
                temp.next = temp1;
                cur = cur.next.next;
            }
            return dummyhead.next;

        }
    }
}
