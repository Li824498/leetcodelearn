package L2LinkedList;

public class Leet5_19 {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummyhead = new ListNode();
            dummyhead.next = head;

            ListNode slow = dummyhead;
            ListNode fast = dummyhead;

            while(n != 0 && fast != null){
                fast = fast.next;
                n--;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;

            return dummyhead.next;

        }
    }
}
