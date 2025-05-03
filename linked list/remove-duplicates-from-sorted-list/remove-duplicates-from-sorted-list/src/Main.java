//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
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
        int[] input = {1, 1, 2, 3, 3};
        ListNode head = createList(input);

        System.out.print("Original List: ");
        printList(head);

        Solution solution = new Solution();
        ListNode noDuplicates = solution.deleteDuplicates(head);

        System.out.print("After Removing Duplicates: ");
        printList(noDuplicates);
    }
}