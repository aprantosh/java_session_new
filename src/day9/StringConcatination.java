package day9;

public class StringConcatination {
    public static void main(String[] args) {
        String greeting = "hello" + " welcome" + " to" + " the" + " java" + " world!!";
        System.out.println(greeting);

        StringBuilder greetWord = new StringBuilder();
        greetWord.append("hi");
        greetWord.append(" my");
        greetWord.append(" name");
        greetWord.append(" is");
        greetWord.append(" prantosh");

        String finalWord = greetWord.toString();
        System.out.println(finalWord);

        String repeatedString = "prantosh".repeat(4);
        System.out.println(repeatedString);
    }
}