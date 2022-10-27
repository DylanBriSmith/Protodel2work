package receiverPackage;

import analysis.UserSelection;
import commandPackage.AnalysisCommand;
import resultPackage.Result;

public class AnalysisReceiver {

    public AnalysisReceiver() {
    }

    public Result perform(AnalysisCommand aCommand, UserSelection aUserSelection) {
        //this is where we will have our facade and receiver.  The receiver will have the perform
        //this is from lab4  the result is just a string that will close out the function(it will post to terminal saying what was done)
        //this is where we will either call a facade or we do the analysis methods

        Result aResult = new Result();

        aResult.setResult("Analysis performed");
        return aResult;
    }
}
