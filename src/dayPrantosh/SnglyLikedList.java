package dayPrantosh;

import java.util.Stack;

public class SnglyLikedList {

    private ListNode head;


    public static class ListNode {
        private ListNode next;
        private int data;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        SnglyLikedList sl = new SnglyLikedList();
        sl.head = new ListNode(10);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(222);
        ListNode third = new ListNode(2222111);
        ListNode fourth = new ListNode(111);

        sl.head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        //fourth.next = null;
        sl.display();
    }

    void display() {
        ListNode curret = head;
        while (curret != null) {
            System.out.print(curret.data + " ------>");
            curret = curret.next;


        }
        System.out.println("null");
    }
}
//
//
//public  static  class Stack{
//        Stack<TreeNode> stack=new Stack<TreeNode>();
//        Stack.push(root);
//        while(!Stack.IsEmpty()) {
//            TreeNode temp = Stack.pop();
//            System.out.println(temp.data);
//            if( temp.right!=null){
//                stack.push(temp.right);
//            }
//            if (temp.left != null){
//                stack.push(temp.left);
//            }



