

import java.util.List;
import java.util.ArrayList;

// The Friendship class
//
//
public class FriendShip {
    /* public String nameKey;
      public  String friendName;

            public String getNameKey() {
          return nameKey;
      }

      public void setNameKey(String nameKey) {
          this.nameKey = nameKey;
      }
           public String getFriendName() {
          return friendName;
      }

      public void setFriendName(String friendName) {
          this.friendName = friendName;
      }


      public Friendship(String nameKey) {
          this.nameKey = nameKey;
      }

          public Friendship(String nameKey, String friendName) {
          this.nameKey = nameKey;
              this.friendName = friendName;
      }*/
    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them "friends" of each other.
    //
    // Note: The order of names does not matter
    // Note: Do not forget to write tests to have good test coverage for this
    // method
    static List<Friend> friends=new ArrayList<>();
    public void makeFriend(String nameKey, String friendName) {

        Friend f=new Friend(nameKey,friendName);
        Friend f1=new Friend(friendName,nameKey);
        friends.add(f);
        friends.add(f1);


    }


    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them no longer friends of each other.
    //
    // Note: The order of names does not matter
    // Note: Do not forget to write tests to have good test coverage for this
    // method
    public void unmakeFriend(String nameKey, String friendName) {
        if(!friends.isEmpty())
        {
            for(Friend f:friends)
            {
                if(f.getNameKey().equals(nameKey) && f.getFriendName().equals(friendName))
                    friends.remove(f);
            }
        }
    }


    // This is for you to implement
    //
    // This method takes a single argument (name) and
    // returns all immediate "friends" of that name
    //
    // For example, A & B are friends, B & C are friends, and C & D are friends.
    // getDirectFriends(B) would return A and C
    // getDirectFriends(D) would return C
    //
    // Note: It should not return duplicate names
    // Note: Do not forget to write tests to have good test coverage for this
    // method
    public List<String> getDirectFriends(String nameKey) {
        List<String> all = new ArrayList<>();
        if(!friends.isEmpty() )
            for(int i=0;i<friends.size();i++)
                if( friends.get(i) !=null &&  friends.get(i).nameKey.equals(nameKey))
                    all.add(friends.get(i).friendName);


        return all;
    }


    // This is for you to implement (Seniors and above)
    //
    // This method takes a single argument (name) and
    // returns all the indirect "friends" of that name
    //
    // For example, A & B are friends, B & C are friends, and C & D are friends.
    // getInirectFriends(A) would return C and D
    //
    // Note: It should not return duplicate names
    // Note: Do not forget to write tests to have good test coverage for this
    // method

    public List<String> getIndirectFriends(String nameKey) {
        return null;
    }
}
