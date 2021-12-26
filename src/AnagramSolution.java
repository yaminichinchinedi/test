import java.util.*;

public class AnagramSolution {
    public static void main(String args[]) throws Exception {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
       String[] output ;
       int length = input.length;
String[] sort  = new String[length];
Map<String, Integer> map= new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>();
       List<String> anagram = new ArrayList<String>();
        List<String> nonanagram = new ArrayList<String>();
int i =1;
String s;
       //[["bat"],["nat","tan"],["ate","eat","tea"]]
        for(int j=0;j< input.length;j++) {
            input[j] = input[j].replaceAll("[^a-zA-Z]]", "");
            input[j] = input[j].toLowerCase();

            if (input[j].length() > 1) {

                char[] arr = input[j].toCharArray();
                Arrays.sort(arr);
                 s = arr.toString();

                if(map.containsKey(s))
                    map.put(s, map.get(s)+1);
                else
                    map.put(s,1);


            }
        }


        for(Map.Entry<String, Integer> entry:map.entrySet())
        if(entry.getValue()>1) {
            anagram.add(entry.getKey().toString());

        }
                else {
            nonanagram.add(entry.getKey());

        }

        for(int k=0;k<anagram.size();k++)
            System.out.println(anagram.get(k));
        for(int k=0;k<nonanagram.size();k++)
            System.out.println(nonanagram.get(k));
        }
    }


