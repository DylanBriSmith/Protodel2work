package client;

import analysis.UserSelection;
import commandPackage.AnalysisCommand;
import commandPackage.Command;
import login.Login;

public class Client {

    public Client() {
    }

    public static void main(String[] args) {
        //CLIENT UNIT IS A SINGLETON CLASS  FROM  LAB 4
        ClientUnit anClientUnit = ClientUnit.getInstance();


        Login session1 = new Login();
        session1.setSize(500,130);
        session1.setVisible(true);


        session1.login("JOHN", "noPassword1");
        //opens gui
        //Time for user selection

       UserSelection userSelection1 = new UserSelection("Canada", 4, 4, "hospitalbeds", "pie-chart");
       //userSelection1.setCountryCode("JO");

       Command aCommand = new AnalysisCommand(userSelection1);

        // we give the singleton the command and tell it to execute, this is what is actually running our code
        //the command .doAction is going to be the command for the calculate button on the mainui
       ClientUnit.setClientUnitCommand(aCommand);
       anClientUnit.execute();

    }
}
