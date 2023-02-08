package dayPrantosh;

import java.util.Arrays;

public class EvenArray {

    public static void main (String[] args){

        int arr[]={1,4,5,6,77,12,24,19};
        int[] x = Remove(arr);
        System.out.println(Arrays.toString(x));

    }
    public static int[] Remove(int[]arr){

        int i = 0;
        int counter= 0;
        for (i=0;i< arr.length ;i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
//        Arrays.fill(arr,0);
        int[] newArr = new int[counter];
        int id = 0;
            for (i=0;i< arr.length;i++){
                if(arr[i]%2 == 0) {
                    newArr[id] = arr[i];
                    id++;
                }

            }

            return newArr;

    }
}
