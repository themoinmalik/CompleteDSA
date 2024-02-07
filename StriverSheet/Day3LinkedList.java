package src.StriverSheet;



public class Day3LinkedList {


    public static void main(String[] args) {

    }


    public static ListNode mergeSortedLL(ListNode l1, ListNode l2){
        return l1;
    }

    // remove nth node..
    public static ListNode remove(ListNode head, int k){

        ListNode left , right;
        left = right = head;

        for (int i = 0; i < k; i++) {
            right = right.next;
        }

        while (right.next!=null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return head;


    }

    // add two numbers ..

    public static ListNode addTwoNum(ListNode head1, ListNode head2){

        return head1;


    }
}
