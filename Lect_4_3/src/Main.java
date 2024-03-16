import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4));


//        var el = Methods.getElementFromIntegerCollection(data, 1);
//        System.out.println(el);
//        var el = Methods.<Integer>getElementFromUCollection(data, 2);
        Integer el = Methods.<Integer>getElementFromUCollection(data, 2); // <Integer> не обязательно
        System.out.println(el);
        el = Methods.getElementFromUCollection(data, 3);
        System.out.println(el);

    }
}