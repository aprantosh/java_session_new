package dayPrantosh;

public class DoublyLinkedList {


    private ListNode head;
    private ListNode tail ;
    private int length;

    public class ListNode {
        private ListNode previous;
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;

        }
    }
    public DoublyLinkedList(){
            this.head= head;
            this.tail = tail;
            this.length = 0;

    }
    public boolean IsEmpty(){
        return length ==0;  //head is null
    }

    public int length(){
        return length();
    }

    }
