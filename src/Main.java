public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> numbers = new MyDictionary<>();
        numbers.add(0, "zero");
        numbers.add(1, "one");
        numbers.add(2, "two");
        numbers.add(3, "three");
        numbers.getIndex(0);
        numbers.getIndex(1);
        numbers.getIndex(2);
        numbers.getIndex(3);
        numbers.amount();

    }
}