package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    final List<ForumUser> listOfForumUsers = new ArrayList<ForumUser>();

    public List<ForumUser> getUserList() {
        listOfForumUsers.add(new ForumUser(1, "Adam", 'M', 1986, 7, 31, 32));
        listOfForumUsers.add(new ForumUser(2, "Ewa", 'F', 1987, 1, 23, 51));
        listOfForumUsers.add(new ForumUser(3, "Kamil", 'M', 1986, 2, 12, 7));
        listOfForumUsers.add(new ForumUser(4, "Krzysztof", 'M', 1990, 5, 2, 45));
        listOfForumUsers.add(new ForumUser(5, "Emilia", 'F', 1993, 8, 7, 8));
        listOfForumUsers.add(new ForumUser(6, "Darek", 'M', 1998, 12, 30, 0));
        listOfForumUsers.add(new ForumUser(7, "Karolina", 'F', 2003, 5, 21, 4));
        listOfForumUsers.add(new ForumUser(8, "Daniel", 'M', 2004, 9, 15, 34));

        return new ArrayList<ForumUser>(listOfForumUsers);
    }
}
