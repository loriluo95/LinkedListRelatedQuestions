import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeTest {
    ListNode testNode = new ListNode(1);

    @Test
    public void testDeleteNode() {
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        assertEquals(3, testNode.size(testNode));
        DeleteNode.deleteNode(testNode, 2);
        assertEquals(2, testNode.size(testNode));
    }
}