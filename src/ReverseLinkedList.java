public class ReverseLinkedList {

    public static ListNode iterative(ListNode list) {
        ListNode prev = null;
        ListNode curr = list;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode recursive(ListNode list) {
        if (list == null || list.next == null)
            return list;

        ListNode reversedList = recursive(list.next);
        list.next.next = list;
        list.next = null;
        return reversedList;
    }

    public static void main(String[] args) {
        ListNode testNode = new ListNode(1);
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        System.out.println(testNode.val);
        ListNode result1 = iterative(testNode);
        System.out.println(result1.val);
        ListNode result2 = iterative(result1);
        System.out.println(result2.val);

    }
}
