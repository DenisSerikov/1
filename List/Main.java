package List;
public class Main {
    public static void main(String[] args) {
        MyList myList = new LinkList();
        myList.add(0);
        myList.add(3);
        myList.add(1,2);
        myList.add(6);
        myList.remove(2);
        System.out.println(myList);
    }
}