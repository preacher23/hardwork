package idgenerator;

public class UserDao {
    public int create(User user){
        int i = IdGenerator.generateId();
        return i;
    }
}
