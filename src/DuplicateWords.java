import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DuplicateWords {

public static void main(String[] args) {

    String S = "Hello World Welcome to the World Hello Team";

    String[] strrray = S.toLowerCase(Locale.ROOT).trim().split("\\W");

    Map<String, Integer> map = new HashMap<>();

    for(String str : strrray){

        if(map.containsKey(str))
            map.put(str, map.get(str)+1);
        else
        map.put(str, 1);

    }

   for(Map.Entry<String, Integer> entry : map.entrySet())
        if(entry.getValue()>1)
            System.out.println("The Repeated Character is: "+entry.getKey());

}
}
