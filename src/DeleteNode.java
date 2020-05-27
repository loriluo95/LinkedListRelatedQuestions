public class DeleteNode {

    public static ListNode deleteNode(ListNode list, int target) {
        if (list == null) return null;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = list;
        ListNode curr = dummyHead;
        ListNode prev = null;
        while (curr != null) {
            if (curr.val == target) {
                prev.next = curr.next;
                curr = null;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode testNode = new ListNode(1);
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        testNode.print(testNode);
        testNode.print(deleteNode(testNode,2));
    }
}
