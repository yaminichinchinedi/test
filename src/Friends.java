import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Friends {
    static ArrayList<Person> persons = new ArrayList<>();

    public static Person savePerson(String name) {
        //  persons.stream().collect(Collectors.toList())
        Person p = null;
        for (Person pe : persons.stream().filter(pe -> pe != null).collect(Collectors.toList())) {
            if (pe.getName().equalsIgnoreCase(name)) {
                p = pe;

            }

        }
        if (p == null) {
            p = new Person(name);

         //   persons.add(p);

        }
        return p;
    }

    static void makeFriend(String nameKey, String friendName) {
        Person p = savePerson(nameKey);
        Person f = savePerson(friendName);
        if(p.getFriends()!=null && !p.getFriends().isEmpty())
        for(Person pe:p.getFriends().stream().filter(pe->pe!=null).collect(Collectors.toList()))
            if(!pe.getName().equals(friendName)) {
                List<Person> ls =p.getFriends();
                ls.add(f);
                p.setFriends(ls);
            }

        persons.add(f);
        persons.add(p);

    }

    public static void main(String args[]) throws Exception {
        makeFriend("B", "C");
        makeFriend("B", "D");

        makeFriend("A", "B");
        makeFriend("A", "C");
        for(Person pe : persons.stream().filter(pe -> pe != null).collect(Collectors.toList())) {
            System.out.println("Person Name is: "+pe.getName());
            if(pe.getFriends()!=null && !pe.getFriends().isEmpty()) {
                for (Person p : pe.getFriends())
                    System.out.print("Friends are: " + p.getName() + " ");

                System.out.println();
            }

        }

    }
}
