import java.util.Scanner;

 class MyException {

    public static void main(String[] args) throws AgeException {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Age : ");
         int age = scan.nextInt();
         if(age < 18){
         throw new AgeException("You are under age");
         }else {
             System.out.println("You are eligible for DL");
         }

    }
}

class AgeException extends  Exception {

    AgeException(String msg){
        super(msg);
    }

}
