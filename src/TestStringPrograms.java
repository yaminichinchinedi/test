import java.util.*;
import java.util.stream.Collectors;

public class TestStringPrograms {

    public static void main(String args[]) throws Exception {

        // Print DUPLICATE WORDS IN A string
        String str = "Hello World! Welcome World. Hello Team!";
        str= str.replaceAll("[^a-zA-Z0-9 ]","");
        String[] arr = str.split("\\W");
        Map<String, Integer> map1 = new HashMap<>(arr.length);
        for(String s:arr){
            if(map1.containsKey(s))
                map1.put(s,map1.get(s)+1);
            else
                map1.put(s,1);


        }


        for(Map.Entry<String, Integer> entry: map1.entrySet())
        {

            //Print duplicate words and its count
            if(entry.getValue()>1)
                System.out.println("The duplicate words are: "+entry.getKey()+". And the count of duplicate words are: "+entry.getValue());
            //Print non repeated words
            else
                System.out.println("The non repeated words are: " + entry.getKey());

        }





        // print first non repeated character
           String stri="taeeter";

        for(char c:stri.toCharArray()) {
            if(stri.indexOf(c)==stri.lastIndexOf(c))
                System.out.println("Non repeated chars are: "+c);
            else
                System.out.println(" repeated chars are: "+c);

        }
          for(char c:stri.toCharArray()) {

                  if (stri.indexOf(c) == stri.lastIndexOf(c)) {
                      System.out.println("First non repeated character in the string is: " + c);
                      break;
                  }

          }

    }
}
