public class FindNthNodeII {

    public static int findNthNodeFromEnd(ListNode list, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = list;
        ListNode curr = dummyHead;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        int indexFromHead = length - n;
        curr = dummyHead;

        while (indexFromHead > 0) {
            curr = curr.next;
            indexFromHead--;
        }

        return curr.val;
    }

    public static void main(String[] args) {
        ListNode testNode = new ListNode(1);
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        System.out.println(findNthNodeFromEnd(testNode, 3));
    }
}
