import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Ascii {
    int width = 140;
    int height = 14;
    String text_string;


    public Ascii(int width_input, int height_input, String string_input) {
        width = width_input; height = height_input; text_string = string_input;

    }

    public void printAscii() {

        BufferedImage bufferedImage2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);

        Graphics graphics2 = bufferedImage2.getGraphics();
        Graphics2D graphics2D2 = (Graphics2D) graphics2;

        graphics2D2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D2.drawString(text_string, 2, 12);

        for (int y = 0; y < height; y++) {
            StringBuilder stringBuilder2 = new StringBuilder();

            for (int x = 0; x < width; x++) {
                stringBuilder2.append(bufferedImage2.getRGB(x, y) == -16777216 ? "*" : " ");
            }

            if (stringBuilder2.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(stringBuilder2);
        }}


}