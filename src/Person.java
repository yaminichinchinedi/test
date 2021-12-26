import java.util.ArrayList;
import java.util.List;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    String name;

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    List<Person> friends ;

    public void addFriend(Person p){

        if(this.friends.isEmpty())
        {
            this.friends = new ArrayList<>();
        }

        this.friends.add(p);

    }


}
