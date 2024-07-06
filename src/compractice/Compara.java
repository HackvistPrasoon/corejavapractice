package compractice;

import java.util.ArrayList;
import java.util.Collections;

public class Compara implements Comparable<Compara>{

    private String name;
    private int year;
    public double rating;

    @Override
    public int compareTo(Compara c) {
        return this.year - c.year ;
    }

    public Compara(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName(){
        return  name;
    }
    public int getYear(){
        return year;
    }
    public double getRating(){
        return rating;
    }

    public static void main(String[] args) {

        ArrayList<Compara> com = new ArrayList<>();
        com.add(new Compara("jeena marna",1990,6.6));
        com.add(new Compara("tere bina rahna nhi",2001,6.6));
        com.add(new Compara("yadgar",2015,6.6));
        com.add(new Compara("vivah",2002,6.6));
        Collections.sort(com);

        for(Compara c : com){
            System.out.println(""+c.getName()+ " - "+c.getRating()+" - "+c.getYear());
        }


    }

}