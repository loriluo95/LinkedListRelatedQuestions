import java.util.HashSet;
import java.util.Set;

public class HasCycle {

    public static boolean hasCycle(ListNode list) {
        Set<ListNode> set = new HashSet<>();

        while (list != null) {
            if (set.contains(list)) {
                return true;
            } else {
                set.add(list);
            }
            list = list.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode testNode = new ListNode(1);
        ListNode testNode2 = new ListNode(2);
        ListNode testNode3 = new ListNode(3);
        testNode.next = testNode2;
        testNode2.next = testNode3;
        testNode3.next = testNode;
        System.out.println(hasCycle(testNode));
    }
}
