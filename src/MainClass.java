import java.util.Arrays;
import java.util.regex.Pattern;

class MainClass {
public static void main(String args[]) {


    int[] even = {2, 4, 6};
    int[] meEvenToo = {2, 4, 6};
    int[] odd = {3, 5, 7};

    System.out.println("even and meeventoo matched? "+Arrays.equals(even,meEvenToo));
    System.out.println("even and odd matched? "+Arrays.equals(even,odd));


    for(int i=0; i<even.length; i++)
    { for(int j=0; j<even.length; j++)
    {
        if(even[i] == meEvenToo[j])
        {  System.out.println("The matched value:" + even[i]);
        }
        if(even[i] == odd[j])
        System.out.println("The matched value:" + even[i]);

    }
    }


    String text = "aab";
    String pattern = ".*a*b";
    boolean eq= Arrays.equals(even, meEvenToo);
    System.out.println(eq);
    boolean eq1= Arrays.equals(even, odd);
    System.out.println(eq1);
boolean b = Pattern.matches(pattern,text);
    System.out.println(b);

}
}