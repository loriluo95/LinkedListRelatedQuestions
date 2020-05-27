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
}
