package domain;

import java.util.List;

public class Group {
    int groupId;
    private List<User> users;

    public Group(int groupId, List<User> users) {
        this.groupId = groupId;
        this.users = users;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
