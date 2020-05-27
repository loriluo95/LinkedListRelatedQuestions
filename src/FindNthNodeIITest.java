import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNthNodeIITest {
    ListNode testNode = new ListNode(1);

    @Test
    public void testFindNthNodeFromEnd() {
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        assertEquals(1, FindNthNodeII.findNthNodeFromEnd(testNode, 3));
    }

    @Test
    public void testListDoesNotHaveNNode() {
        ListNode newNode = new ListNode(1);
        newNode.next = new ListNode(2);
        Exception removeException = assertThrows(IllegalArgumentException.class, () -> {
            FindNthNodeII.findNthNodeFromEnd(newNode, 3);
        });
        String expectedMessage = "ListNode too short";
        assertEquals(expectedMessage, removeException.getMessage());
    }

}