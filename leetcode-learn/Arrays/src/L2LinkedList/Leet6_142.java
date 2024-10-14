package L2LinkedList;

public class Leet6_142 {
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
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    static public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null && fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
                if(slow == fast) {
                    ListNode index1 = head;
                    ListNode index2 = slow;
                    while(index1 != index2) {
                        index1 = index1.next;
                        index2 = index2.next;
                    }
                    return index1;
                }
            }
            return null;

        }
    }
}
