package study.linkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IsCircularLinkedList {

    public static void main(String[] args) {

//        ListNode head =


    }

    public static boolean hasCycle(ListNode head) {

        Set<Integer> set = new HashSet<>();

        ListNode current = head;



        while(current !=null){
            System.out.println(current.val);
            ListNode nextNode = current.next;
            if (set.contains(nextNode.val)) return true;
            else set.add(nextNode.val);
        }

        return false;


    }


}

class ListNode {
   int val;
   ListNode next;
   ListNode(int x) {
       val = x;
       next = null;
  }
}
