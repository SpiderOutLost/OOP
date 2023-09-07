package test;

//создать 3-ю коллекци, в которой имя + соответствующий ему индекс
// Shara - 1
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(NumbersNames());
    }

    private static ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Shara");
        names.add("Nice");
        names.add("James");
        names.add("Mike");
        names.add("Lucy");
        return names;
    }

    private static ArrayList<Integer> Numbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        return numbers;
    }

    private static ArrayList NumbersNames() {
        ArrayList numbersandnames = new ArrayList();
        ArrayList names = getNames();
        ArrayList number = Numbers();
        for (int i = 0; i < number.size(); i++) {
            numbersandnames.add(names.get(i) + " - " + number.get(i));

        }
        return numbersandnames;
    }
}