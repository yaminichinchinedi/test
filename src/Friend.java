
public class Friend{
    String nameKey;
    String friendName;

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


    public Friend(String nameKey) {
        this.nameKey = nameKey;
    }

    public Friend(String nameKey, String friendName) {
        this.nameKey = nameKey;
        this.friendName = friendName;
    }

}