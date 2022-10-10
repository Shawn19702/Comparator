import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortMethod {
    public static void SortNamesmethod(ArrayList<Person> people) {
        Collections.sort(people, new NameCompare());
        for (Person i : people) {
            System.out.println(i);
        }
    }

    public static void SortNumbermethod(ArrayList<Person> people) {
        Collections.sort(people, new Compared());
        for (Person i : people) {
            System.out.println(i);
        }
    }


}




