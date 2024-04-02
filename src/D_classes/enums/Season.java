package D_classes.enums;

// basic enum - no fields, methods, constructor
//public enum Season { // enum = enumerated type - a type (Season) where all vales are enumerated in advance and the client cannot create their own values of this type
//    WINTER, SPRING, SUMMER, FALL // the enum constants
//}

public enum Season { // enum = enumerated type - a type (Season) where all vales are enumerated in advance and the client cannot create their own values of this type
    WINTER("cold"),
    SPRING("rainy"),
    SUMMER("hot"),
    FALL("chilly");

    private final String weather;

    Season(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }
}
