
package farhans.weatherconsoleapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApp extends BaseWeatherApp  {
    



    public void displayWeather(String city) {
        String jsonResponse = getWeatherData(city);

        try {
            JSONObject obj = new JSONObject(jsonResponse);
            String cityName = obj.getString("name");
            double temperature = obj.getJSONObject("main").getDouble("temp");
            String weatherCondition = obj.getJSONArray("weather").getJSONObject(0).getString("description");

            System.out.println("Weather in " + cityName + ":");
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Condition: " + weatherCondition);

        } catch (Exception e) {
            System.out.println("Invalid city or API error.");
        }
    }
}


