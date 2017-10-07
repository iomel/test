package lesson9;

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
        String[] nameList = new String[getUsers().length];
        for(int i = 0; i < getUsers().length; i++)
            nameList[i] = getUsers()[i].getName();
        return nameList;
    }

    public long[] getUserIds()
    {
        long[] idList = new long[getUsers().length];
        for(int i = 0; i < getUsers().length; i++)
            idList[i] = getUsers()[i].getId();
        return idList;
    }

    public String getUserNameById(long id)
    {
        for(User user : getUsers())
            if(user.getId() == id)
                return user.getName();

        return "No such user";
    }


}
