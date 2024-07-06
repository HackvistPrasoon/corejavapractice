package compractice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        MyInterface.interface1 inter = new Impl();
        int data = inter.getdata();
        System.out.println(data);

        Class c = null;


    }
}