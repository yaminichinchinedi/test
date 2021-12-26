import java.util.regex.Pattern;

public class StaticBlock {
    static {
        System.out.println("b");
    }

   public static void main(String args[]) {
        System.out.println("c");
       System.out.println(Scalar.i);

       String pattern = ".*abc.*";
       String stri="abcabcjkajdoabbjbbnbbbaaabbcbc";
       boolean b = Pattern.matches(pattern,stri);
       System.out.println("Pattern exists "+b);
    }
}

