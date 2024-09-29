package domain.Repository;

import domain.Group;

import java.util.concurrent.ConcurrentHashMap;

public class GroupRepository {

    public static int groupId = 1;
    public static ConcurrentHashMap<Integer, Group> map = new ConcurrentHashMap<>();

    public static Group save(Group group) {
        group.setGroupId(groupId++);
        map.put(group.getGroupId(), group);
        return group;
    }
}
