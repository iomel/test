package lesson9.users;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    //----- TASK 2 ---------------------

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames()
    {
        if (users == null)
            return null;
        int count = 0;
        for(User user : users)
            if(user != null)
                count++;

        String[] nameList = new String[count];
        count = 0;

        for(User user : users)
            if(user != null) {
                nameList[count] = user.getName();
                count++;
            }

        return nameList;
    }

    public long[] getUserIds()
    {
        if (users == null)
            return null;
        int count = 0;
        for(User user : users)
            if(user != null)
                count++;

        long[] idList = new long[count];
        count = 0;

        for(User user : users)
            if(user != null) {
                idList[count] = user.getId();
                count++;
            }

        return idList;
    }

    public String getUserNameById(long id)
    {
        if (users == null)
            return null;

        for (User user : users)
        {
            if (user == null)
                continue;
            else if (user.getId() == id)
                return user.getName();

        }
        return null;
    }

}