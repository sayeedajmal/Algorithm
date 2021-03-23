import java.util.LinkedList;

public class List {
    /* Linked List */
    static LinkedList<String> list = new LinkedList<>();

    public static void main(String args[]) {
        add(0, args);
        remove(0);
        remove(0);
        duplicate();
    }

    public static void add(int index, Object item) {
        item = new Object();
        list.add("Name: ");
        list.add("Sayeed");
        list.add(1, "is");
        System.out.println("All List " + list);
    }

    public static void remove(int index) {
        list.remove(1);
        System.out.println("Removed Int Index: " + list);
    }

    public static void remove(Object item) {
        list.remove("Sayeed");
        System.out.println("Object is Removed : " + list);
    }

    public static List duplicate() {
        list.add(1,"Sayeed");
        return duplicate();
    }
}
