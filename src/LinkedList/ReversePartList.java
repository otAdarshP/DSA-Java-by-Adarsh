package LinkedList;

public class ReversePartList{
    ListNode head;
    int size;

    ReversePartList(){
        this.size = 0;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode (int val){
            this.val = val;
        }

        ListNode (int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
// 1->2->3->4->5
    // 1->4->3->2->5

    public static ListNode reverseBetween (ListNode head, int left, int right){
        if (head == null){
            return head;
        }
        if (right == left){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        for(int i = 0; i < left - 1; i++){
            prev = current;
            current = current.next;
        }
        ListNode newEnd = current;

        ListNode next = current.next;
        for (int i = 0; i < left - right + 1; i++){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

return current; // WRONG ANSWER
    }

    public static boolean palindrome (ListNode head){
        if (head == null || head.next == null){
            return true;
        }

        ListNode firstHalfEnd = getMid (head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        ListNode firstHalfStart = head;

        while (secondHalfStart != null){
            if (secondHalfStart.val != firstHalfStart.val){
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
        return true;
    }

    public static ListNode getMid (ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode reverseList (ListNode head){

        ListNode prev = null;
        ListNode current = head;

        while (current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}