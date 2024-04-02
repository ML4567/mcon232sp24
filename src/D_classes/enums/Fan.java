package D_classes.enums;

public class Fan {
    public enum Speed {
        SLOW, MEDIUM, FAST
    }

    private String color;
    private Speed speed;

    public Fan(String color, Speed speed) {
        this.color = color;
        this.speed = speed;
    }
}
