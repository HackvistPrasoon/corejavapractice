package singel;

public class Employee {
    private static Employee emp;
    private Employee(){
    }
    public static Employee getEmpObject(){
                if(emp == null) {
                    emp = new Employee();
                }
        return emp;
    }


}
