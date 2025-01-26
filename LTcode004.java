class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LTcode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); 
        ListNode current = dummyHead;
        int carry = 0; 

       
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; 
            int y = (l2 != null) ? l2.val : 0; 
            int sum = x + y + carry; 

            carry = sum / 10; 
            current.next = new ListNode(sum % 10); 
            current = current.next; 

           
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        LTcode004 solution = new LTcode004();
        ListNode result = solution.addTwoNumbers(l1, l2);

        
        printList(result); 
    }

    
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}