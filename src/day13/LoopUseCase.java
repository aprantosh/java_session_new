package day13;

public class LoopUseCase {
    public static void main(String[] args) {

//        int i;
//        for (i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
//        System.out.println("printing i outside the loop " +i );

        int totalSaving = 0;
        int age = 20;

        //infinite for loop....and break point is necessary in nifinite loop
        for(;;){
            double randomSaving = Math.random()*1000;
            //System.out.println(randomSaving);
            totalSaving += randomSaving;
            if(totalSaving >= 10000000){
                break;
            }
            age++;
        }
        System.out.println("retirement age = "+ age);

//        //infinite while loop
//        while(true){
//
//        }
//
//        //infinite do while loop
//        do{
//
//        }while (true){
//
//        }
    }
}