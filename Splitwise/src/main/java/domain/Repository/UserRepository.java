package domain.Repository;

import domain.User;

import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    public static int userId = 1;
    public static ConcurrentHashMap<Integer, User> map = new ConcurrentHashMap<>();

    public static User save(User user) {
        user.setUserId(userId++);
        map.put(user.getUserId(), user);
        return user;
    }

}
