import java.util.ArrayList;
import java.util.HashMap;

public class MyDictionary <TYPE1, TYPE2> {
    TYPE1 value1;
    TYPE2 value2;

    HashMap <TYPE1, TYPE2> number;

    public MyDictionary() {
        this.value1 = value1;
        this.value2 = value2;
        this.number = new HashMap<>();
    }
    public void add (TYPE1 value1, TYPE2 value2) {
        number.put(value1, value2);
    }
    public void getIndex (TYPE1 value) {
        System.out.println(number.get(value));
    }
    public void amount () {
        System.out.println("Кількість пар : " + number.size());
    }
}




