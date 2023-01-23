
public class Lops {
    public static void main(String[] args) {
        int arr[]  = {10, 11, 112, 1122};
        int max = arr[0];
        int i;
        for (i = 0; i <= arr.length; i++) ;
        {
            if (arr[i] > max) ;
            max = arr[i];
        }
        System.out.println(max);
    }

}