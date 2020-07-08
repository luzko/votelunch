package by.luzko.votelunch;

import by.luzko.votelunch.model.Role;
import by.luzko.votelunch.model.User;

import java.util.Collections;
import java.util.Date;

import static by.luzko.votelunch.model.AbstractBaseEntity.START_SEQ;

public class UserTestData {
    public static TestMatcher<User> USER_MATCHER = TestMatcher.usingFieldsComparator("registered", "roles");

    public static final int NOT_FOUND = 10;
    public static final int USER1_ID = START_SEQ;
    public static final int USER2_ID = START_SEQ + 1;
    public static final int ADMIN1_ID = START_SEQ + 2;

    public static final User USER1 = new User(USER1_ID, "User1", "user1@yandex.ru", "password", Role.USER);
    public static final User USER2 = new User(USER2_ID, "User2", "user2@mail.ru", "pass", Role.USER);
    public static final User ADMIN1 = new User(ADMIN1_ID, "Admin1", "admin@gmail.com", "admin", Role.ADMIN);

    public static User getNew() {
        return new User(null, "New", "new@gmail.com", "newPass", false, new Date(), Collections.singleton(Role.USER));
    }

    public static User getUpdated() {
        User updated = new User(USER1);
        updated.setName("UpdatedName");
        return updated;
    }
}
