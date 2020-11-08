package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        // homework
        /*ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next;
            if(fast.next == null)
                break;
            slow = slow.next;
            fast = fast.next;
        }
        ListNode OH = slow.next;
        slow.next = null;

        return OH;

         */
        if(head == null || head.next == null)    return null;

        ListNode pre = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;

        return slow;
    }

    public static ListNode mergeLists(ListNode l1, ListNode l2) {
        // homework
        ListNode prev = new ListNode(0), cur = prev;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 == null) cur.next = l2;
        else cur.next = l1;

        return prev.next;
    }
}
