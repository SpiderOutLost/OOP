package example;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0; //хранит реальное кол-во элементов
    public  String get(int index){
        return array[index];
    }
    public void add(String element) {
        array[size] = element;
        size++;
        if (size == array.length) {
            String[] newarray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newarray[i] = array[i];
            }
            array = newarray;


        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }

    public void remove(String element) {
        for (int i=0;i < size; i++) {
            if (element.equals(array[i])) {
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}