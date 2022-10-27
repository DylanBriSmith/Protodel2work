package login;

import java.util.HashMap;

public class ProxyLogin extends UserData {
    String incomingUsername, incomingPassword;
    static boolean loginStatus = false;
    static String loginMessage;


    /**
     * This is a constructor for ProxyLogin with parameters username and password.
     * @param username- String containing username in (Uppercase) from login page by user
     * @param password- String containing password from login page by user
     * This constructor will check if the username and password is correct and update login message.
     * This constuctor calls proxyLoginCheck method to check if the username and password is correct.
     * This constructor will update login message and login status.
     */
    public ProxyLogin(String username, String password) {
        boolean loginStatus =proxyLoginChecker(username, password);
    }


    /**
     * This is a method for validating username and password and return a boolean value.
     * @param username- String coming from user as a username
     * @param password- String coming from user as a password
     * @return - boolean value if login is successful or not and login message is updated for login class.
     */
    boolean proxyLoginChecker(String username, String password) {
        this.incomingUsername=username;
        this.incomingPassword=password;
        loginStatus= doValidate(incomingUsername, incomingPassword,loginMessage);
        return loginStatus;
    }


    /**
     * This is a method for validating username and password and return a boolean value.
     * @param username - String coming from user as a username
     * @param password - String coming from user as a password
     * @param loginMessage - String as a placeholder for proxy class to keep login message
     * @return - boolean value if login is successful or not and login message is updated for login class.
     */
    public boolean doValidate(String username, String password ,String loginMessage )   {
        boolean flag=false ;
        UserData uData=new UserData();
        HashMap<String,String> loginData = uData.getUserData();

        //	System.out.println(loginData);

        if(loginData.containsKey(username)) {
            if(loginData.get(username).equals(password)) {
                flag=true;
                loginMessage="Login Successful" ;
            }else {
                loginMessage="Invalid Password- Login Unsuccessful" ;
            }

        }else {
            loginMessage="Username doesnot exist" ;

        }

        return flag;


    }
}