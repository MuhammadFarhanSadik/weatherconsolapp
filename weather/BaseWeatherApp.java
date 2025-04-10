
package farhans.weatherconsoleapp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author farha
 */
public class BaseWeatherApp {
    protected String apiKey = "237f8273539d702c7c53319fd144ef73";
    protected String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=Chittagong&appid=237f8273539d702c7c53319fd144ef73&units=metric";

    protected String getWeatherData(String city) {
        // Code for fetching data from the API (as shown earlier)
      try {
            String requestUrl = apiUrl + city + "&appid=" + apiKey + "&units=metric";
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            return response.toString();

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}



