import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    ListNode testNode = new ListNode(1);

    @Test
    public void testIterative() {
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        assertEquals(1, testNode.val);
        assertEquals(3, ReverseLinkedList.iterative(testNode).val);
    }

    @Test
    public void testRecursive() {
        ListNode testNode = new ListNode(1);
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        assertEquals(1, testNode.val);
        assertEquals(3, ReverseLinkedList.recursive(testNode).val);
    }

}