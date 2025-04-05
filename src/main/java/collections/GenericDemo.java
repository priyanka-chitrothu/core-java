package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo {
    public static void main(String[] args) throws IOException {
        Collection<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(66);
        values.add(88);

        for (int i: values){
            System.out.println(i);
        }

    }
}
