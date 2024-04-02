package D_classes.enums;

public class SeasonDemo {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        System.out.println(s); // SPRING
        System.out.println(s.getWeather()); // rainy

        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season + " is " + season.getWeather());
        }
    }
}
