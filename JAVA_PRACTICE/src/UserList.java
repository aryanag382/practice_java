import java.util.ArrayList;
import java.util.List;

public class UserList {

    public static void main(String[] args) {
        List<Object> users=new ArrayList<>();
        users.add("aryan");
        users.add("summit");
        users.add("rahul");
        users.add(1);
        for(Object user:users){
            System.out.println(user);
        }


    }
}
