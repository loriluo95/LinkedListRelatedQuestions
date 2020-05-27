public class ReverseLinkedList {

    public ListNode iterative(ListNode list) {
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

    public ListNode recursive(ListNode list) {
        if (list == null || list.next == null)
            return list;

        ListNode reversedList = recursive(list.next);
        list.next.next = list;
        list.next = null;
        return reversedList;
    }
}
