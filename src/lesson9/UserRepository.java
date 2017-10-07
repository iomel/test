package lesson9;

import javax.jws.soap.SOAPBinding;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames()
    {
        if (users == null || users.length == 0)
            return null;
        String[] nameList = new String[users.length];
        for(int i = 0; i < users.length; i++)
            nameList[i] = users[i].getName();
        return nameList;


    }

    public long[] getUserIds()
    {
        long[] idList = new long[users.length];
        for(int i = 0; i < users.length; i++)
            idList[i] = users[i].getId();
        return idList;
    }

    public String getUserNameById(long id)
    {
        for(User user : users)
            if(user.getId() == id)
                return user.getName();

        return "No such user";
    }

    public User getUserByName(String name)
    {
        if (users == null || users.length == 0)
            return null;

        for(User user : users)
            if(user.getName() == name)
                return user;

        return null;
    }

    public User getUserById(long id)
    {
        if (users == null || users.length == 0)
            return null;

        for(User user : users)
            if(user.getId() == id)
                return user;

        return null;
    }

    public User getUserBySessionId(String sessionId)
    {
        if (users == null || users.length == 0)
            return null;

        for(User user : users)
            if(user.getSessionId() == sessionId)
                return user;

        return null;
    }

}
