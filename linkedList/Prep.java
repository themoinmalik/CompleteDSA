package src.linkedList;

import java.util.List;

public class Prep
{

    public static void main(String[] args) {

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

}
