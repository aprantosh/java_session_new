package dayPrantosh;
import java.util.Arrays;
import java.util.HashSet;

public class TwoArrays
{
    public static void main(String[] args)
    {
        Integer[] firstArray = {0,2,4,6,8};
        Integer[] secondArray = {2,1,2,1,2,1,10,11,1,3,5,7,9};

        int i = 0;
        HashSet<Integer> abc  = new HashSet<>();



            // HashSet<Integer> abc  = new HashSet<>();
           int  temp1 = firstArray[i];
           int  temp2 = secondArray[i];
            //abc.addAll(Arrays.asList(temp1,temp2));
            abc.add(temp1);
            abc.add(temp2);
            i++;
            System.out.println(abc);
    }
//        Integer[] union = {};
//        union = abc.toArray(union);
//
//        System.out.println(Arrays.toString(union));

//        HashSet<Integer> set = new HashSet<>();
//
//
//        set.addAll(Arrays.asList(firstArray));
//
//        set.addAll(Arrays.asList(secondArray));

        //set.remove();
   //     System.out.println(set);

        //convert to array

    }




//
//s
