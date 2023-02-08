package dayPrantosh;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            //this.next = Integer.parseInt(null);
        this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current!= null){
            System.out.println(current.data + " -->");
            current = current.next;
        }
        System.out.println("null");


    }
        public static void main(String[] args){

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode( 12);
        ListNode fourth = new ListNode(20);


        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();

        }

}