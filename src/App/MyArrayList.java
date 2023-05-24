package App;

public class MyArrayList <String> {
    public String[] list;
    private int size;
    private int capacity = 0;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        list = (String[]) new Object[capacity];

    }
    public void increaseCapacity() {
        capacity = capacity * 2;
        String[] newList = (String[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
            list[i] = null;
        }
        list = newList;
    }

    public void display() {
        for (String value : list) {
            System.out.print(value + " ");
        }
    }

    public boolean add(int index, String value) {
     if (index < 0 || index > size) {
         return false;
     }
     if (size == list.length) {
         increaseCapacity();
     }

     for (int i = size; i > index; i--) {
         list[i] = list[i - 1];
     }

     list[index] = value;
     size++;
     return true;

     }


    public boolean add(String value) {
        list[size++] = value;
        return true;
    }

    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;

        }

        for (int i = index; i < size - 1; i++) {

            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size--;
        return true;

    }

    public boolean delete(String value) {

        for (int i = 0; i < size; i++) {

            if (list[i].equals(value)) {

                return delete(i);
            }
        }

        return true;

    }

    public String get(int index) {

        if (index < 0 || index >= size) {
            return null;
        }
        return list[index];

    }

}
