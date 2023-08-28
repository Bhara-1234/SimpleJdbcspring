package example;

import java.util.HashMap;

public interface UserContractor {
 public HashMap<String,String> userdata();
 public boolean available(String username,String password);
}
