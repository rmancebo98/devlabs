import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class practice {


    public static void main(String[] args) {
        practice pr = new practice();
        pr.doubleForLoopOne();
        pr.doubleForLoopTwo();
        pr.ListOfList();
        pr.maxEvenSum();
        reverseString();
        startsAndEndsWith1();
        removeRepeatedCharacters();
        armstrongNumber();

        employee emp = new employee(1, "Roberto");
        emp.employeeInfo();
    }

    public void doubleForLoopOne() {
        for (int number1 = 0; number1 <= 6; number1++) {
            for (int number2 = 1; number2 < number1; number2++) {
                System.out.print(number2);
            }
            System.out.println();
        }
    }

    public void doubleForLoopTwo() {
        int number1 = 1;
        for (int number2 = 1; number2 <= 5; number2++) {

            for (int number3 = 1; number3 < number2; number3++) {

                System.out.print(number1);
                number1++;

            }
            System.out.println();
        }
    }

    public void sortNumbers() {
        int[] numbers = {1, 2, 5, 3};

    }

    public void ListOfList() {
        List<String> employee = new ArrayList<>();
        List<List<String>> employees = new ArrayList<>();

        employee.add("emp1");
        employee.add("001");
        employee.add("24");

//        employees.addAll(employee);
        employees.add(employee);

        employee = new ArrayList<>();
        employee.add("emp2");
        employee.add("002");
        employee.add("25");
        employees.add(employee);

        System.out.println(employees);

    }

    public void maxEvenSum() {
        int[] arr = {3, 6, 1, 4};
        int maxSum;
        int iterator = 3;

        for (int x = 0; x < arr.length - 1; x++) {

            for (int i = 0; i < arr.length - x - 1; i++) {
                if (arr[i + 1] > arr[i]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        maxSum = arr[0] + arr[1] + arr[2];

        while (maxSum % 2 != 0) {
            maxSum = arr[0] + arr[1] + arr[iterator];
            if (iterator < arr.length - 1) {
                iterator++;
            }
        }

        System.out.println(maxSum);
    }

    public static void reverseString() {
        String word = "something";

        char[] array = word.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }
        System.out.println(sb);
    }

    public static void startsAndEndsWith1() {
        String str = "12031110171911881510111070";
        char[] characters = str.toCharArray();
        char charac;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < characters.length; i++) {
            charac = characters[i];
            if (charac == 1) {
                do {
                    result.append(characters[i]);
                    i++;
                } while (characters[i] != 0);
            }
        }
        System.out.println(result);
    }

    public static void removeRepeatedCharacters() {
        String str = "Testing is fun";
        char[] characters = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char chara : characters) {
            set.add(chara);
        }
        System.out.println(set);
    }

    public static void armstrongNumber() {
        int number = 153;
        int originalNumber;
        int remainder;
        int result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
