import java.util.HashMap;
import java.util.Set;

public class TestHashmap {


  /*


2 -> abc.   ,  def. // overrided the value



    }
    */
public static void main(String[] args){

    HashMap<String, String> h1 = new HashMap<>();

    h1.put("abc","abc");
    h1.put("def","def");

    h1.put("abc","efg");


//h1.equ
    for(String s: h1.keySet()) {
        System.out.println("Keys are " + s);
    }
    for(String s: h1.values()) {
        System.out.println("values are " + s);
    }
    String str1 = "Yamini";
    String str2 = "Lakshmi";

System.out.println("Before swap "+str1+" " +str2);

    int length1 = str1.length();
    int length2 = str2.length();

    str1 = str1+str2;
    str2=str1.substring(0,length1);
    str1=str1.substring(length1,str1.length());
    System.out.println("AFTER swap "+str1+" " +str2);


}
}
