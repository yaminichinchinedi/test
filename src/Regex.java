import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
        {
public static void main(String args[])
        {
        String text = "abcbbbbcccbdddadacb";
        String pattern = ".*bc.*";
        //System.out.println(isMatch(text, pattern));
/*Pattern p = Pattern.compile(pattern);
Matcher m= p.matcher(text);
boolean b=m.matches();
System.out.println(b); */
boolean b1=Pattern.matches(pattern,text);

                System.out.println(b1);

                //System.out.println(p.group());
        }

public static boolean isMatch(String text, String pattern)
        {
        if(pattern.isEmpty())
        {
        return text.isEmpty();
        }
        boolean matchFound = false;
        if((!text.isEmpty() && text.charAt(0) == pattern.charAt(0)) || pattern.charAt(0) == '.')
        {
        matchFound = true;
        }

        if(pattern.length() >= 2 && pattern.charAt(1) == '*')
        {
        return (isMatch(text, pattern.substring(2)) || (matchFound && isMatch(text.substring(1), pattern)));
        }
        else
        {
        return isMatch(text.substring(1), pattern.substring(1));
        }
        }
        }
