package MyInterface;

@FunctionalInterface
public interface Employee {
    public String sayHello();

    default void sayBye(){

    }
}
