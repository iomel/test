package lesson9.users;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        if (users == null)
            return null;
        String[] nameList = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null)
                continue;
            nameList[i] = users[i].getName();
        }
        return nameList;
    }

    public long[] getUserIds()
    {
        if (users == null)
            return null;

        long[] idList = new long[users.length];
        for(int i = 0; i < users.length; i++) {
            if (users[i] == null)
                continue;
            idList[i] = users[i].getId();
        }
         return idList;
    }

    public String getUserNameById(long id) {

        if (users == null)
            return null;

        for (User user : users) {
            if (user == null)
                continue;
            if (user.getId() == id)
                return user.getName();
        }
        return "No such user";
    }

    // task 3 methods

    public User getUserByName(String name)
    {
        if (users == null ||  name == null)
            return null;

        for(User user : users) {
            if (user == null)
                return null;
            if (user.getName() == name)
                return user;
        }
        return null;
    }

    public User getUserById(long id)
    {
        if (users == null)
            return null;

        for(User user : users) {
            if (user == null)
                return null;

            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public User getUserBySessionId(String sessionId)
    {
        try {

            if (users == null || sessionId == null)
                return null;

            for (User user : users) {
                if (user == null || user.getSessionId() == null)
                    return null;

                if (user.getSessionId() == sessionId)
                    return user;
            }
            return null;
        } catch (NullPointerException e)
        { return null; }
    }

    // task 4 methods

    private User findById(long id)
    {
        return getUserById(id);
    }

    public User save(User user)
    {
        if (user == null || users == null)
            return null;
        if(findById(user.getId()) == user)
            return null;

        for (User u : users)
        {
            if(u == null)
                u = user;
            break;
        }
        return user;
    }
}
