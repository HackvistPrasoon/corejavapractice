package singel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SingelMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Employee em =  Employee.getEmpObject();
        System.out.println(em.hashCode());
        Constructor<Employee> con = Employee.class.getDeclaredConstructor();
        con.setAccessible(true);
        System.out.println(con.hashCode());

        // Employee em1 =  Employee.getEmpObject();.getEmpObject();
       // System.out.println(em1.hashCode());

    }
}
