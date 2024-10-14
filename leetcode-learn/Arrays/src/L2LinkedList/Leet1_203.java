package L2LinkedList;

public class Leet1_203 {
    public static void main(String[] args) {
            // 返回 3

    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution1 {
        public ListNode removeElements(ListNode head, int val) {
            while(head != null&&head.val == val) {
                head = head.next;
            }
            ListNode cur = head;
            while(cur != null&&cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return head;

        }
    }

    static class Solution2 {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummyhead = new ListNode();
            dummyhead.next = head;
            ListNode cur = dummyhead;
            while(cur != null&&cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return dummyhead.next;

        }
    }
}
