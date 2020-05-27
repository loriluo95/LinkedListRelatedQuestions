import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasCycleTest {
    HasCycle hc = new HasCycle();
    ListNode testNode = new ListNode(1);
    ListNode testNode2 = new ListNode(2);
    ListNode testNode3 = new ListNode(3);

    @Test
    public void testHasCycle() {
        testNode.next = testNode2;
        testNode2.next = testNode3;
        testNode3.next = testNode;
        assertTrue(hc.hasCycle(testNode));
    }

    @Test
    public void testDoesNotHaveCycle() {
        testNode.next = testNode2;
        testNode2.next = testNode3;
        testNode3.next = null;
        assertFalse(hc.hasCycle(testNode));
    }


}