import java.util.*;

public class lab4 {
    public static void main(String[] args) {
        //Assignment 1
        occurrenceOfEachCharacterUsignHashMap();
        //Assignment 2
        reverseArrayList();
        //Assignment 3
        checkIfKeyExistsInMap();
        //Assignment 4
        convertKeysToList();
        //Assignment 5
        convertHashSetToObjectArray();
        //Assignment 6
        firstAndLastValueTreeSet();
        //Assignment 7
        alphabeticallySort();
        //Assignment 8
        viewHashTable();
    }

    public static void occurrenceOfEachCharacterUsignHashMap() {
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

    public static void reverseArrayList() {
        ArrayList<String> text = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> reversed = new ArrayList<>();

        for (int i = text.size() - 1; i >= 0; i--) {
            reversed.add(text.get(i));
        }
        System.out.println(reversed);
    }

    public static void checkIfKeyExistsInMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("First", "A");
        map.put("Second", "B");
        map.put("Third", "C");
        map.put("Forth", "D");

        String key = "First";

        if (map.containsKey(key)) {
            System.out.println("Key " + key + " exist");
        } else {
            System.out.println("Key " + key + " doesn't exist");
        }
    }

    public static void convertKeysToList() {
        HashMap<String, String> map = new HashMap<>();
        List<Object> list = new LinkedList<>();

        map.put("First", "A");
        map.put("Second", "B");
        map.put("Third", "C");
        map.put("Fourth", "D");

        for (int i = 0; i < map.size(); i++) {
            list.add(map.keySet().toArray()[i]);
        }

        System.out.println(list);
    }

    public static void convertHashSetToObjectArray() {
        HashSet<String> set = new HashSet<>();
        set.add("Yes");
        set.add("No");
        set.add("Maybe");
        set.add("Never");
        String[] list = new String[set.size()];
        int i = 0;

        for (String key : set) {
            list[i++] = key;
        }

        System.out.println(Arrays.toString(list));
    }

    public static void firstAndLastValueTreeSet() {
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(50);
        tree.add(1);
        tree.add(56);
        tree.add(8);

        System.out.println("Smallest item is " + tree.first() + " and biggest is " + tree.last());
    }

    public static void alphabeticallySort() {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("august", "december", "car", "bat"));
        Collections.sort(arr);
        System.out.println(arr);
    }

    public static void viewHashTable(){
        Hashtable table = new Hashtable();
        table.put("Java", "J");
        table.put("C++", "C");
        table.put("JavaScript", "JS");

        Enumeration en = table.keys();

        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
