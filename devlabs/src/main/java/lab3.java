import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class lab3 {

    public static void main(String[] args) {
        //Assignment 1
        occurrenceOfEachCharacter();
        //Assignment 2
        isPalindrome();
        //Assignment 3
        checkIfBrownIsPresent();
        //Assignment 4
        stringToCharAndViceversa();
        //Assignment 5
        handleNumberFormatException();
        //Assignment 6
        throwsArithmeticException();
        //Assignment 7
        tryNestBlock();
        //Assignment 8
        retrowException();
    }

    public static void occurrenceOfEachCharacter() {
        HashMap<Character, Integer> counter = new HashMap<>();
        String text = "DevLabs Alliance Training";
        char[] textToCharacter = text.toLowerCase().toCharArray();
        for (char character : textToCharacter) {
            if (counter.containsKey(character)) {
                counter.put(character, counter.get(character) + 1);
            } else {
                counter.put(character, 1);
            }
        }

        System.out.println(counter);
    }

    public static void isPalindrome() {
        String text = "something";
        char[] array = text.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            builder.append(array[i]);
        }

        if (text.equals(builder.toString())) {
            System.out.println("palindrome");
        } else {
            System.out.println("is not palindrome");
        }
    }

    public static void checkIfBrownIsPresent() {
        String text = "A brown fox ran away fast";
        String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            if (Objects.equals(word, "brown")) {
                System.out.println("brown is present");
            }
        }
    }

    public static void stringToCharAndViceversa() {
        String text = "something";
        char[] array = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        System.out.println("As characters " + Arrays.toString(array));
        for (char character : array) {
            builder.append(character);
        }
        System.out.println("Back as a string " + builder);
    }

    public static void handleNumberFormatException() {
        String string = "text";
        int number;
        try {
            number = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Number format is invalid.");
        }
    }

    public static void throwsArithmeticException(){
        int cero = 0;
        int number = 20;
        int c;

        try {
            c = number/cero;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException has been thrown");
        }
    }

    public static void tryNestBlock(){
        int number = 20;
        int divider = 5;
        int result = 0;

        try {
            result = number/divider;
            divider--;
            try {
                result = number/divider;
                divider --;
                try {
                    result = number/divider;
                }catch (ArithmeticException e){
                    System.out.println(number + " cannot be divided by " + divider);
                }
            }catch (ArithmeticException e){
                System.out.println(number + " cannot be divided by " + divider);
            }
        }catch (ArithmeticException e){
            System.out.println(number + " cannot be divided by " + divider);
        }
        System.out.println(result);
    }

    public static void retrowException(){
        String string = "text";
        int number;
        try {
            number = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Number format is invalid.");
            number = Integer.parseInt(string);
        }
    }
}
