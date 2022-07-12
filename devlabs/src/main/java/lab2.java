import java.util.ArrayList;
import java.util.List;

public class lab2 {

    public static void main(String[] args) {
        //Assignment1
        calculateAverage();
        //Assignment2
        findOddNumber();
        //Assignment3
        is13PrimeNumber();
        //Assignment4
        findTheSumOfDigits();
        //Assignment5
        reverseANumber();
        //Assignment6
        findDuplicatesInArray();
    }

    public static void calculateAverage() {
        int[] values = {1, 2, 3, 4, 5};
        int total = 0;
        int average;

        for (int value : values) {
            total = total + value;
        }

        average = total / values.length;
        System.out.println(average);
    }

    public static void findOddNumber() {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 79; i <= 187; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
        System.out.println(oddNumbers);
    }

    public static void is13PrimeNumber() {
        int num = 13;
        boolean flag = false;
        for (int i = 2; i <= num /2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("13 is a prime number.");
        }
    }

    public static void findTheSumOfDigits(){
        String number = "1234";
        char[] numbers = number.toCharArray();
        int total =0;

        for (char num : numbers){
            int naturalNumber = Integer.parseInt(String.valueOf(num));
            total = total + naturalNumber;
        }

        System.out.println(total);
    }

    public static void reverseANumber(){
        int number = 123;
        String numberToText = Integer.toString(number);

        char[] array = numberToText.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }
        System.out.println(sb);
    }

    public static void findDuplicatesInArray(){
        int[]numbers = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};

        int count;

        for (int i = 0; i < numbers.length; i++) {
            count = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > 1)
                System.out.println(numbers[i] + " is repeated.");
        }
    }
}
