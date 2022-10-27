package datafetcher;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;


public class DataFetcher {

private String urlString;

    public HashMap<Integer, Integer> getData() {
        return data;
    }

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    public DataFetcher(String url) {
        this.urlString = url;
        int value;


        try {
            URL link = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) link.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                String inline = "";
                Scanner sc = new Scanner(link.openStream());
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }
                sc.close();
                JsonArray jsonArray = new JsonParser().parse(inline).getAsJsonArray();
                int size = jsonArray.size();
                int sizeOfResults = jsonArray.get(1).getAsJsonArray().size();
                int year;
                for(int i=0;i<sizeOfResults;i++){
                    year = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();

                    if(jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull()){
                       value= 0;
                    }
                    else{
                        value=jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsInt();
                    }
                    data.put(year,value);
                    System.out.println("Year: " +year+" Value: "+value);
                }
            }


        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}