public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) {
        val = x;
    }

    public void print(ListNode list) {
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
    }

    public int size(ListNode list) {
        int length = 0;
        while (list != null) {
            length++;
            list = list.next;
        }
        return length;
    }
}
