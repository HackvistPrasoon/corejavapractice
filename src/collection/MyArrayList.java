package collection;

import org.omg.CORBA.StringHolder;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.stream.Collectors;

public class MyArrayList{
    String name ;
    int age ;

    public static void main(String[] args) {
        ArrayList<Person> list =new ArrayList<>();
         list.add(new Person("Auresh",41));
         list.add(new Person("Zamesh",35));
         list.add(new Person("Banohar",70));
         list.add(new Person("Zuresh",41));
        Collections.sort(list);
    list.forEach(System.out::println);

    }
}

class Person implements Comparable<Person>{
    String name;
    Integer age;

    Person(String name,Integer age){
        this.name=name;
        this.age = age;
    }

   @Override
    public String toString(){
     return name+" - "+age;
   }

    @Override
    public int compareTo(Person o) {

        return this.name.compareTo(o.name);
    }
}
