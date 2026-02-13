import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer , String> user=new HashMap<>();
        user.put(1,"sam");
        user.put(2,"ram");
        user.put(3,"kanha");
        for(Map.Entry<Integer ,String> entry : user.entrySet()){
          System.out.println(entry.getKey() + ":" + entry.getValue());
      }

    }
}
