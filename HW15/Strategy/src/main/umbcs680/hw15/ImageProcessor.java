package umbcs680.hw15;
import java.util.function.Function;

public class ImageProcessor {
    public static Image process(Image image, Function<Color, Color> modifier) {
        int height = image.getHeight();
        int width = image.getWidth();
        Image processed = new Image(height, width);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                processed.setColor(x, y, modifier.apply(image.getColor(x, y)));
            }
        }

        return processed;    
    }
}