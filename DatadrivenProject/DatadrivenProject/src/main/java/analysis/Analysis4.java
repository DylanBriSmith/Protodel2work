package analysis;

import datafetcher.DataFetcher;

public class Analysis4 implements Analysis {

    private String analysisName="CO2 VS GDP";

    @Override
    public void doAnalysis(UserSelection userSelection) {

    }

    @Override
    public String getAnalysisName() {return analysisName; }

    @Override
    public void doComputations() {
        //No computation required
    }

    Analysis4(UserSelection userSelection){
        String urlCO2 = AnalysisSupport.buildURL(userSelection.getCountry(), userSelection.getStartDate(), userSelection.getEndDate(), "EN.ATM.CO2E.PC");
        String urlGDP = AnalysisSupport.buildURL(userSelection.getCountry(), userSelection.getStartDate(), userSelection.getEndDate(), "NY.GDP.PCAP.CD");
        DataFetcher dataFetcherCO2 = new DataFetcher(urlCO2);
        DataFetcher dataFetcherGDP = new DataFetcher(urlGDP);

    }


}
