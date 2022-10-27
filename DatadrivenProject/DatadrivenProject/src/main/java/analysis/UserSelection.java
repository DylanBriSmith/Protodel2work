package analysis;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UserSelection {


    private  String country;
    private  int startDate , endDate; ;

    private String selectedAnalysis;
    //public String[] availableAnalysis= {new Analysis1().getAnalysisName() ,new Analysis2().getAnalysisName() ,new Analysis3().getAnalysisName() ,new Analysis4().getAnalysisName() } ;

    private String selectedView;
    //public ArrayList availableViews= (new Analysis1().getAvailableViews(),new Analysis2().getAvailableViews(),new Analysis3().getAvailableViews(),new Analysis4().getAvailableViews());

    public String getCountry() {
        return country;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }



    public String getSelectedAnalysis() {
        return selectedAnalysis;
    }




    public UserSelection(String country, int startDate, int endDate , String selectedAnalysis , String selectedView) {
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
        this.selectedAnalysis=selectedAnalysis;
        this.selectedView=selectedView;


        //currently it is randomly selected but later need to be changed to user selection from the GUI
        //selectedAnalysis=availableAnalysis[((int) Math.random()* (availableAnalysis.length-0+1))+0];


    }

    /**
     * This method is used to validate the user selection for country and date range and available analysis
     * @param userSelection
     */
    private void validateUserSelection(UserSelection userSelection) {
        try {
            FileReader fileReader = new FileReader("src/main/resources/analysis/ISO-Country-Code.csv");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }





}









