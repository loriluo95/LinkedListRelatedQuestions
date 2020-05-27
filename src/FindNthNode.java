public class FindNthNode {

    public static int findNthNode(ListNode list, int n) {
        boolean FOUND = false;

        while (n > 1 && list != null) {
            list = list.next;
            n--;
        }

        if (n > 1)
            throw new IllegalArgumentException("ListNode has less than nth node");

        return list.val;
    }
    public static void main(String[] args) {
        ListNode testNode = new ListNode(1);
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        System.out.println(findNthNode(testNode, 2));
    }
}
