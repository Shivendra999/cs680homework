package umbcs680.hw15;
public class GrayScaler {
    public static Color modify(Color color) {
        // Calculate the average of the RGB components
        int avg = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
        // Create a new grayscale color with the average value
        return new Color(avg, avg, avg);
    }
}