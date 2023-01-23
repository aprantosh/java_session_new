package day4;

public class  Weather {


    public static String getWind_speed() {
        return Wind_speed;
    }

    public void setWind_speed(String wind_speed) {
        Wind_speed = wind_speed;
    }

    public String getHumidity() {
        return Humidity;
    }

    public void setHumidity(String humidity) {
        Humidity = humidity;
    }

    public static String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    private String Temperature;
    private static String Wind_speed;
    private String Humidity;
    private static String rain;

   public Weather(String Temperature, String Wind_speed, String Humidity, String rain) {
        this.Temperature =Temperature;
        this.Wind_speed =Wind_speed;
        this.Humidity =Humidity;
        this.rain =rain;
    }
}
