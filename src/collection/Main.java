package collection;

import java.util.StringTokenizer;

public class Main {
    public  static  void  main(String []args){
     String str = " hello bro how are you what is happening";
        StringTokenizer st = new StringTokenizer(str);
        char[] ch = null;
        while(st.hasMoreElements()){
            System.out.println(" "+st.countTokens());
            System.exit(0);
        }

    }
}
