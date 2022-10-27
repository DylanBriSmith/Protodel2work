package commandPackage;

import analysis.UserSelection;
import receiverPackage.AnalysisReceiver;
import resultPackage.Result;

public class AnalysisCommand extends Command{
    private UserSelection userSelection;

    public AnalysisCommand(UserSelection userSelection) {
        this.userSelection = userSelection;
    }

    public Result doAction() {
        //this is from lab4  the result is just a string that will close out the function(it will post to terminal saying what was done)
        //here we will have our facade and receiver.  The receiver will have the perform
        AnalysisReceiver aReceiver = new AnalysisReceiver();
        Result aResult = aReceiver.perform(this, this.userSelection);
        return aResult;
    }
}
