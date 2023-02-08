package day14;

import java.util.Arrays;
import java.util.Scanner;

public class Ailabuila{

    public static int Binart( int arr[], int x) {

        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(x == arr[mid]){
                return mid;
            } else if (x > arr[mid]) {
                end = mid +1 ;
            }else {
                end = mid -1;
            }

        }
        return -1;
    }
    public static void main (String[][] args){

        int arr[] = {1,2,3,1,2,3,1,2,3};
        //System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
//        String scanner = scanner.next();
        //String y = scanner.next();
        System.out.println("Enter the number you would like to print");
        int x = scanner.nextInt();
        int Searching = Binart(arr, x);
        System.out.println(Searching);

    }
}