package src.linkedList;

import java.util.List;

public class Prep
{

    public static void main(String[] args) {

        List list = new List();

        List list1 = new List();
        List list2 = new List();
        list1.insertDataLast(1);
        list1.insertDataLast(2);
        list1.insertDataLast(3);
        list1.insertDataLast(4);
        list2.insertDataLast(1);
        list2.insertDataLast(4);
        list2.insertDataLast(6);
        // list.display(list.head);
        // list.insertFirst(30);
        // list.display(list.head);
        // list.delete(2);
        // list.display(list.head);
        // Node head = list.reverseList(list.head);
        System.out.println("reversed");
        // list.display(head);
        System.out.println("mid node...");
        // int num = list.midNode(list.head);
        // System.out.println(num);
        // boolean ans = list.findNode(20);
        // System.out.println(ans);
        // int ans1 = list.lenNodeRec(list.head);
        // System.out.println(ans1);
        // remove element....
        System.out.println("remove.... ");
         Node node = list.removeElement(list.head, 6);
         list.display(node);
        System.out.println("removed done");
        // duplicates...
        // Node ans1 = list.removeDuplicates(list.head);
        // list.display(ans1);

//        Node ans = list.mergeNode(list1, list2);
//        list.display(ans);

        // happy
//        int ans1 = list.sumSqr(19);
//        System.out.println("ans-> " + ans1);

        // happy calling...
//        boolean ans2 = list.happyNum(19);
//        System.out.println("ans 2-> " + ans2);

        // remove
//        Node rem = list.removeEl(list.head, 3);
//        list.display(rem);
        //


    }

    class Solution {
        public ListNode reverseList(ListNode head) {


            ListNode temp = null;
            ListNode curr = head;
            ListNode prev = null;

            while (curr->next!=null){
                temp = curr;
                curr = curr->next;
                prev = temp->next;
            }

            return prev;

        }
    }

    // remove element from
    public Node removeEl(Node head, int x){

        Node temp = head;

        while (temp!=null && temp.next!=null){

            if (temp.next.data==x){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return temp;

    }


    // reverse from k group...
    public static ListNode reverseKGroup(ListNode head, int k){

        if (head == null){
            return head;
        }

        // check length of LL
        int len = 0;
        ListNode lenNode = head;
        while (lenNode != null){
            len++;
            lenNode = lenNode.next;
        }

        //

        if (len < k){
            return head;
        }

        // reverse..

        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;
        int newk = 1;

        while (newk <=k && curr!=null){

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            newk++;
        }

        head.next = reverseKGroup(temp, k);


        return prev;

    }


    /// palindrom...


    public static boolean isPalindrom(ListNode head){


        // find the middle..


        ListNode middle = middle(head);

        // reverse middle to null.
        ListNode reverse = reverse(middle);

        ListNode first = head;
        ListNode second = reverse;


        while (first!=middle && second !=null){

            if (first!=second){
                return false;
            }
            first = first.next;
            second = second.next;

        }

        return true;

    }

    // find middle
    public static ListNode middle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return slow;
            }
        }
        return head;
    }

    public static ListNode reverse(ListNode head){

        ListNode temp = null;
        ListNode curr = head;
        ListNode prev = null;

        while (curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


    // find cycle and intesecrtion node ...
    public static ListNode findCycle(ListNode head){

        ListNode s = head;
        ListNode f = head;
        ListNode e = head;

        while (f!=null && f.next !=null ){

            s = s.next;
            f = f.next.next;

            if (s==f){
                while (e!=s){
                    s = s.next;
                    e = e.next;
                }
                return s;
            }
        }
        return null;
    }
}
