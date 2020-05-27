import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNthNodeTest {
    ListNode testNode = new ListNode(1);

    @Test
    public void testFindNthNode() {
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        assertEquals(2, FindNthNodeII.findNthNodeFromEnd(testNode, 2));
    }

    @Test
    public void testListDoesNotHaveNNode() {
        ListNode newNode = new ListNode(1);
        newNode.next = new ListNode(2);
        Exception removeException = assertThrows(IllegalArgumentException.class, () -> {
            FindNthNode.findNthNode(newNode, 3);
        });
        String expectedMessage = "ListNode has less than nth node";
        assertEquals(expectedMessage, removeException.getMessage());
    }

}