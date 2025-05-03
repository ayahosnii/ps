public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode listOne, ListNode ListTwo) {

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (listOne != null && ListTwo != null) {
            if (listOne.val < ListTwo.val) {
                tail.next = listOne;
                listOne = listOne.next;
            } else {
                tail.next = ListTwo;
                ListTwo = ListTwo.next;
            }

            tail = tail.next;
        }

        tail.next = listOne != null ? listOne : ListTwo;

        return dummy.next;
    }

    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;  // أضف السطر ده لتحريك المؤشر
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}
