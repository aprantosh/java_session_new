package dayPrantosh ;

public class SecondMax {

        public static void main (String[] args) {

                int[] arr= {1,33,33,22,1112,221,221,7};
                int min = Integer.MAX_VALUE;
                int secmin = Integer.MAX_VALUE;

                for (int i =0; i< arr.length; i++){
                        if( arr[i] > min) {
                                secmin = min;
                                min = arr[i];
                        } else if (arr[i] < secmin && arr[i]!= min){
                                secmin = arr[i];
                        }
                }
                System.out.println(secmin);


        }



        }