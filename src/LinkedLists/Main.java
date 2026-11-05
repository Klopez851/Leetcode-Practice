package LinkedLists;

public class Main {
    public static ListNode recursiveReverseLinkedList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = recursiveReverseLinkedList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static ListNode IterativeReverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(0);
        ListNode fourthNode = new ListNode(-4);

        head.next = secondNode;
        secondNode.next = thirdNode; //Pos 1
        thirdNode.next = fourthNode;
        fourthNode.next = null; // cycle

       head =  recursiveReverseLinkedList(head);

        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
    }
}
