package App;

public class Main {
    public static void main(String[] args) {


        MyArrayList<String> arrayList = new MyArrayList<>();
         arrayList.add("one");
         arrayList.add("two");
         arrayList.add("three");
         arrayList.add("four");
         arrayList.add("five");
         arrayList.add("second");
         arrayList.add(3,"six");
         arrayList.add(6,"seven");
         arrayList.delete("second");
         arrayList.delete(11);
         arrayList.add("ten");

         arrayList.get(5);
         arrayList.add(9,"nine");
         arrayList.add(11,"1");
         arrayList.delete("second");

         arrayList.display();
    }

}
