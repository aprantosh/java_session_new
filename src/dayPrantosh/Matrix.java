package dayPrantosh;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){


        int abc[][]= {{1,2,3},{4,5,6},{7,8,9}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter the number you want to search");
        int x = scanner.nextInt();
        for (int[] row : abc) {
            //System.out.println(Arrays.toString(row));
            String searching = Search(abc, x);
            System.out.println(searching);
        }
    }

    public static String Search(int[][] abc, int x ){

        int i=0;
        int j = abc.length -1;
        while( i< abc.length && j >= 0){
            if( abc[i][j] == x) {

                String message = ("The place of the value is at" + i + "," + j);
            return message;
            }
             else if ( abc[i][j] > x) {
                j--;
            }
            else {
                i++;
            }
        }
        return null;
    }
}
