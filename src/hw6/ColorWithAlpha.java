package hw6;

public class ColorWithAlpha extends Color {
    private int alpha;

    public ColorWithAlpha() {
        super();  // not really necessary, since Java will insert this line automatically
        alpha = 255;

        // OR:
        // this(255, 255, 255, 255);
    }

    // assume that each parameter is >= 0 and <= 255
    public ColorWithAlpha(int red, int green, int blue, int alpha) {
        super(red, green, blue);
        this.alpha = alpha;
    }

    public int getAlpha() {
        return alpha;
    }

    @Override
    public String toString() {
        return "rgba(" + getRed() + ", " + getGreen() + ", " + getBlue() + ", " + alpha + ")";
    }

    @Override
    public void increment() {
        super.increment();

        if (alpha < 255) {
            alpha++;
        }
    }

    @Override
    public void decrement() {
        super.decrement();

        if (alpha > 0) {
            alpha--;
        }
    }
}
