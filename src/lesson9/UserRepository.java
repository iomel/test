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


}
