package L2LinkedList;

public class Leet2_707 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // 链表变为 1->2->3
        myLinkedList.get(1);              // 返回 2
        myLinkedList.deleteAtIndex(1);    // 现在，链表变为 1->3
        myLinkedList.get(1);
//        System.out.println(myLinkedList.);

    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
    }
    static class MyLinkedList {
        int size;
        ListNode head;

        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);

        }

        public int get(int index) {
            if (index < 0||index >= size){
                return -1;
            }
            ListNode cur = head;
            for(int i = 0; i <= index; i++){
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            ListNode newNode = new ListNode(val);
            newNode.next = head.next;
            head.next = newNode;
            size++;

        }

        public void addAtTail(int val) {
            ListNode newNode = new ListNode(val);
            ListNode cur = head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
            size++;
        }

        public void addAtIndex(int index, int val) {
            ListNode toAdd = new ListNode(val);
            ListNode pred = head;
            if(size < index) {
                return;
            }
            if(index < 0){
                return;
            }
            for(int i = 0; i < index; i++){
                pred = pred.next;
            }
            toAdd.next = pred.next;
            pred.next = toAdd;
            size++;
        }

        public void deleteAtIndex(int index) {
            if(index >= size || index < 0){
                return;
            }
            ListNode pred = head;
            for(int i = 0; i < index; i++) {
                pred = pred.next;
            }
            pred.next = pred.next.next;
            size--;

        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
