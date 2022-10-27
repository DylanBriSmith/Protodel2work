package analysis;

import datafetcher.DataFetcher;

public class Analysis2 implements Analysis {

    private String analysisName="PM2.5 VS FOREST AREA";
    @Override
    public String getAnalysisName() {return analysisName; }

    @Override
    public void doComputations() {

    }


    Analysis2(UserSelection userSelection){
        String urlPM = AnalysisSupport.buildURL(userSelection.getCountry(), userSelection.getStartDate(), userSelection.getEndDate(), "EN.ATM.PM25.MC.M3");
        String urlForest = AnalysisSupport.buildURL(userSelection.getCountry(), userSelection.getStartDate(), userSelection.getEndDate(), "AG.LND.FRST.ZS");
        DataFetcher dataFetcherPM = new DataFetcher(urlPM);
        DataFetcher dataFetcherForest = new DataFetcher(urlForest);


    }
    public void doAnalysis(UserSelection userSelection) {


    }

    }



