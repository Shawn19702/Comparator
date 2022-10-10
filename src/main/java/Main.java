import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Comparing numbers


        ArrayList<Person> compare = new ArrayList<>();

        compare.add(new Person(9));
        compare.add(new Person(5));
        compare.add(new Person(6));

        Collections.sort(compare, new Compared());

        for (Person i: compare){
            System.out.println(i);
        }

        //Comparing names

        System.out.println("====================");

        ArrayList<Person> people = new ArrayList<>();

people.add(new Person("John"));

        people.add(new Person("Bob"));

        people.add(new Person("Shawn"));


        Collections.sort(people, new NameCompare());

        for (Person x: people){
          System.out.println(x);
       }
        System.out.println("====================");


        //Comparing names


        //Sorting names and Numbers methods

       SortMethod.SortNamesmethod(people);

        System.out.println("====================");


        SortMethod.SortNumbermethod(compare);


    }


    }



