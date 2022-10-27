package analysis;

import datafetcher.DataFetcher;

public class Analysis3 implements Analysis {

    private String analysisName = "FOREST AREA";

    @Override
    public String getAnalysisName() {
        return analysisName;
    }

    @Override
    public void doComputations() {
        //No computation required
    }


    Analysis3(UserSelection userSelection) {
        String urlForest = AnalysisSupport.buildURL(userSelection.getCountry(), userSelection.getStartDate(), userSelection.getEndDate(), "AG.LND.FRST.ZS");
        DataFetcher dataFetcherForest = new DataFetcher(urlForest);


    }

    public void doAnalysis(UserSelection userSelection) {


    }

}

