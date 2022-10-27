package login;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class UserData {
    HashMap<String, String> userData = new HashMap<String, String>();



    public static String readFileAsString(String file) throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static User[] UserParse(String file) throws Exception {
        String json = readFileAsString(file);
        User[] userArray = new ObjectMapper().readValue(json, User[].class);
        return userArray;
    }
    public UserData() {
        //parse json here and make a HashMap
        try {

            User[] userArray = UserParse("src/main/java/login/userData.json");
            for (User user : userArray) {
                userData.put(user.getUsername(), user.getPassword());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //
        //
        //userData.put("JOHN", "noPassword1");
        //userData.put("ANNA", "noPassword2");
        //userData.put("SAMEUL", "noPassword3");
    }

    protected HashMap<String, String> getUserData() {

        return userData;
    }



}
