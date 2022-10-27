package analysis;

import java.util.ArrayList;

public  class AnalysisSupport {
    static class PairInt {
        Integer Key;
        Integer Value;

        PairInt(Integer Key, Integer Value) {
            this.Key = Key;
            this.Value = Value;
        }
    }

    static class PairString {
        String Key;
        String Value;

        PairString(String Key, String Value) {
            this.Key = Key;
            this.Value = Value;
        }
    }

    private ArrayList<String> availableViews;

    public ArrayList<String> getAvailableViews() {
        return availableViews;
    }

    public void setAvailableViews(ArrayList<String> availableViews) {
        this.availableViews = availableViews;
    }

    public static String buildURL(String countryCode, int startDate, int endDate, String indicatorType) {
        String url = "http://api.worldbank.org/countries/" + countryCode + "/indicators/" + indicatorType + "?date=" + startDate + ":" + endDate + "&format=json";
        return url;
    }


}



