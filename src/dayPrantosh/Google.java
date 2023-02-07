package dayPrantosh;

import java.util.ArrayList;
import java.util.Arrays;

public class Google {
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

    public static void main(String[] args) {


        ArrayList<Integer> abc = new ArrayList<>();
        ArrayList<Integer> xyz = new ArrayList<Integer>();
        // HashSet abc = new HashSet<>();
        int list1[] = {1, 2, 3, 4, 5, 6};
        int list2[] = {3, 1, 1, 2, 4, 5, 6, 1, 11};
        //int counter = list1.length + list2.length;

        for (int digit: list1){
            abc.add(digit);
        }
        for( int digit : list2){
            abc.add(digit);
        }


        }


    }