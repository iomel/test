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
        if (users == null || users.length == 0)
            return null;
        String[] nameList = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null || users[i].getName() == null)
                return null;

            nameList[i] = users[i].getName();
        }
        return nameList;


    }

    public long[] getUserIds()
    {
        long[] idList = new long[users.length];
        for(int i = 0; i < users.length; i++) {
            if (users[i] == null)
                return null;

            idList[i] = users[i].getId();
        }
         return idList;
    }

    public String getUserNameById(long id) {
        for (User user : users) {
            if (user == null)
                return null;

            if (user.getId() == id)
                return user.getName();
        }
        return "No such user";
    }

    // task 3 methods

    public User getUserByName(String name)
    {
        if (users == null || users.length == 0 || name == null)
            return null;

        for(User user : users) {
            if (user == null || user.getName() == null)
                return null;
            if (user.getName() == name)
                return user;
        }
        return null;
    }

    public User getUserById(long id)
    {
        if (users == null || users.length == 0 )
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

            if (users == null || users.length == 0 || sessionId == null)
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
        if (users == null || users.length == 0 )
            return null;

        for(User user : users) {
            if (user == null)
                return null;

            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public User save(User user)
    {
        if(findById(user.getId()) != null)
            return null;

        for (User u : users)
        {
            if(u = null)
                u = user;
            break;
        }
        return user;
    }
}
