package HashTable;

public class Main {
    public static void main(String[] args) {
        Table<Integer, String> myHash = new HTable();
        myHash.put(30, "Hello");
        myHash.put(4, "bye");
        myHash.put(1, "good");
        myHash.put(5, "morning");
        myHash.put(32, "table");
        myHash.put(25, "hash");
        myHash.put(17, "english");
        myHash.put(3,"russian");
        myHash.put(26, "Java");
        myHash.put(8, "Python");

        myHash.put(34, "Hel");
        myHash.put(7, "by");
        myHash.put(29, "go");
        myHash.put(63, "mor");
        myHash.put(37, "tab");
        myHash.put(55, "ha");
        myHash.put(132, "eng");
        myHash.put(60,"rus");
        myHash.put(20, "Ja");
        myHash.put(88, "Py");
        myHash.remove(32);
        myHash.remove(17);
        myHash.remove(8);
        myHash.remove(63);
        myHash.remove(132);
        myHash.remove(88);
        System.out.println(myHash);
    }
}