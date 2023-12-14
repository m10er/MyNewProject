package users;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUsersRepository {
    List<User> userList;

    public InMemoryUsersRepository() {
        userList= new ArrayList<>();
        userList.add(new User("muammer","123456","english"));
        userList.add(new User("said","123456","deutch"));
        userList.add(new User("yusuf","123456","deutch"));
        userList.add(new User("merve","123456","turkce"));

    }
    public void add(User user) {
        userList.add(user);
    }

}
