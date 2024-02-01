package src.linkedList;

public class FindIntersection {


    public static void main(String[] args) {

    }


    public static Node findIntersection(Node l1, Node l2){

        // ind lenght of l1 andl2...
        int len1 = 0;
        int len2 = 0;

        Node temp1 = l1;
        Node temp2 = l2;

        while(temp1.next!=null){
           len1 = len1+1;
           temp1 = temp1.next;
        }

        while (temp2.next!=null){
            len2 = len2+1;
            temp2 = temp2.next;
        }

        temp1 = l1;
        temp2 = l2;

        if (len1>len2){
            int eq = len1-len2;
            for (int i = 0; i < eq; i++) {
                temp1 = temp1.next;
            }
        }else {
            int eq = len2-len1;
            for (int i = 0; i < eq; i++) {
                temp2= temp2.next;
            }
        }

        while (temp1.next!=null || temp2.next!=null){

            if (temp1==temp2){
                return temp1;
            }
            temp1 =temp1.next;
            temp2 = temp2.next;
        }

        return null;

    }


    //


    public static ListNode findReverse(ListNode head){


        ListNode cuur = head;
        ListNode prev =null;

        ListNode temp= null;

        while (cuur.next!=null){

            // reverse
            temp = cuur.next;
            cuur.next = prev;
            // move forward...
            prev = cuur;
            cuur = temp;
        }


        return  prev.next;



    }





//

    public static ListNode deleteNode(ListNode head, int k){

        ListNode left = head;
        ListNode right = head;

        for (int i =0; i<k;i++){

            right = right.next;

        }


        while (right!=null){

            left = left.next;
            right = right.next;
        }

        left.data = left.next.data;
        left.next = left.next.next;


        return head;


    }




















}
