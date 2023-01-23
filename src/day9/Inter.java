package day9;

public class Inter {

    public static void main(String[] args) {

        String abc = ("my name is prantosh neupane i am from uco");
        String[] policy = abc.split(" ");

        StringBuilder xyz = new StringBuilder();
        for (String word :policy) {
          // System.out.println(word);


            xyz.append(word.substring(0,1).toUpperCase() + word.substring(1, word.length()));

            xyz.append(" ");
            //String lops = word.substring(0,1).toUpperCase() + word.substring(1) ;




        }
        System.out.println(xyz.toString().trim());
    }
}