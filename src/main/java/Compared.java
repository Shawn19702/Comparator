import java.util.Comparator;

public class Compared implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getId() > o2.getId()){
            return 1;
        }

        return -1;
    }
}
