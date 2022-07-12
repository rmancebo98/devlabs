import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab1 {

    public static void main (String[] args){
        //Assignment 1
        factorial(5);
        //Assignment 2
        fibonacci();
        //Assignment 3
        bubbleSort();
        //Assignment 4
        leapYear();
        //Assignment 5
        primeNumber();
        //Assignment 6
        triangleArea(5, 5);
        //Assignment 7
        sumOfFirstNaturalNumbers();
        //Assignment 8
        customReverseString(5,"sizes");
        //Assignment 9
        printNumbersTill50();
    }

    public static void bubbleSort() {

        int[] arr = {25, 6, 1, 4};

        for (int x = 0; x < arr.length - 1; x++) {

            for (int i = 0; i < arr.length - x - 1; i++) {
                if (arr[i + 1] > arr[i]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }


    public static void factorial(int number) {
        int something = 1;
        while (number != 0) {
            something = number * something;
            number--;
        }
        System.out.println(something);
    }

    public static void fibonacci() {
        int n1 = 0;
        int n2 = n1++;
        do {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        } while (n1 < 10);
    }

    public static void leapYear() {
        int year = 2000;
        boolean leap;

        if (year % 4 == 0) {
            leap = true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
            }
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year" + year + " is not a leap year");
        }
    }

    public static void primeNumber() {

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 1; primeNumbers.size() < 10; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }

    public static void triangleArea(double height, double base) {
        double area = (height * base) / 2;
        System.out.println("The area of a triangle is: " + area);
    }

    public static void sumOfFirstNaturalNumbers() {
        int newNumber = 0;

        for (int iterator = 1; iterator <= 20; iterator++) {
            newNumber = newNumber + iterator;
        }

        System.out.println(newNumber);
    }

    public static void customReverseString(int size, String text) {

        char[] array = text.toCharArray();

        if (array.length != size) {
            System.out.println("The size entered and the length of the text doesn't match");
        } else {
            StringBuilder sb = new StringBuilder();

            for (int i = size - 1; i >= 0; i--) {
                sb.append(array[i]);
            }
            System.out.println(sb);
        }
    }

    public static void printNumbersTill50(){
        int number = 0;
        do{
            System.out.println(number);
            number++;
        }while (number <= 50);
    }

    public static void triangleOfCeros(){
        String triangle[][];
    }
}
