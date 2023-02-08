package dayPrantosh;

import java.util.*;

public class EasyMining {
    // list1 = [1, 2, 3, 4, 5, 6]
// list2 = [3, 1, 1, 2, 4, 5, 6, 1]
// k = 1
// [3, 1, 1, 2, 4, 5, 6, 1]
//
// k = 2
// [3, 4, 5, 6, 1]
//
//
// The first k elements of list 2 should not contain any value in the first k elements of list1.
//
// k = 3  result = [4, 5, 6, 1]
//
    // Arraylist = easy for not sorting.... (will gives every element) and loww memeort than other.
//    Set => unique value (HashSet, treeset , enumset) Linkedhash set
//    Tree => automatically sorting (always use tree for sorting )
//    Hash=> searching fast, not in order(maitains itself...memory usage low in comparision to Linked Hash(no insertion order maintained)
//    LinkedHash =>  searching fast and insertion order maintained/ store the order in memory




    public static void main (String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        HashSet<Integer> list2 = new HashSet<>();
        HashSet<String> list3 = new HashSet<>();

        HashSet<Integer> list_new = new HashSet<>();
        Collections.addAll(list1,1,2,3,4,5,6);
        Collections.addAll(list2,3,1,1,2,4,5,6,1);
        Collections.sort(list1);

//
//        HashSet<Student> students = new HashSet<>();
//        students.add(new Student("abc",5));
//        students.add(new Student("xyz",2));
//        students.add(new Student("abc",5));
//
//
//
//        Collections.addAll(list3,"Ram","Shyam","Ram");
        System.out.println(list3);
        System.out.println("After applying the method, First List :"+ list1);
        System.out.println("After applying the method, Second List :"+ list2);




    }
}
