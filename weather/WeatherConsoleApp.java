

package farhans.weatherconsoleapp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;


public class WeatherConsoleApp {

   
    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();
        weatherApp.displayWeather("Chittagong");
   
    }
}

    
