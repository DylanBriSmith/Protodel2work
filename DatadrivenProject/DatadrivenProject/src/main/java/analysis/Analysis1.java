package analysis;

import datafetcher.DataFetcher;

import java.util.HashMap;

public class Analysis1 implements Analysis {

    private String analysisName="CO2 VS Energy VS PM2.5";
    public String getAnalysisName() {return analysisName; }






    @Override
    public void doComputations() {

    }




    Analysis1(UserSelection userSelection){
        HashMap<String,String> indicatorName=new HashMap<String,String>();
        indicatorName.put("CO2","EN.ATM.CO2E.PC");
        indicatorName.put("Energy","EG.USE.PCAP.KG.OE");
        indicatorName.put("PM2.5","EN.ATM.PM25.MC.M3");
        String urlCO2 = AnalysisSupport.buildURL(userSelection.getCountry(), userSelection.getStartDate(), userSelection.getEndDate(), indicatorName.get("CO2"));
        String urlEnergy = AnalysisSupport.buildURL(userSelection.getCountry(), userSelection.getStartDate(), userSelection.getEndDate(), indicatorName.get("Energy"));
        String urlPM = AnalysisSupport.buildURL(userSelection.getCountry(), userSelection.getStartDate(), userSelection.getEndDate(), indicatorName.get("PM2.5"));

        DataFetcher dataFetcherCO2 = new DataFetcher(urlCO2);

        DataFetcher dataFetcherEnergy = new DataFetcher(urlEnergy);
        DataFetcher dataFetcherPM = new DataFetcher(urlPM);


    }

    public void doAnalysis(UserSelection userSelection) {






    }






    }


