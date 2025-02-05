package study.linkedlist;

public class MergeLinkedList {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {



        while(list1 != null &&list2 != null ){

            if(list1.val <= list2.val){
                list1 = list1.next;
            }else{
                ListNode temp= list1;
                list1 = list2;
                list1.next= temp;
                list2 = list2.next;
            }
        }

        while(list2 != null){
            list1.next =list2;
            list2 = list2.next;
        }

        return list1;



    }
}
