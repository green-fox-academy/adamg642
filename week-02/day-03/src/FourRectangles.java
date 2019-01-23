import javax.swing.*;
import java.util.Random;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
    Draw4Rectangles(graphics);

    }
    public static void Draw4Rectangles(Graphics graphics2){

        int size = 3;

        float[] col = {0,0,0};
        Random rand = new Random();
        for (int i = 1 ; i < 5 ; i++){
            size = size * i;

           for (int j = 0; j < 3; j++){

               col[j] = rand.nextFloat();
           }
            System.out.println(col[0]);
            Color randomColor = new Color(col[0], col[1], col[2]);
            graphics2.setColor(randomColor);
            graphics2.drawRect(size,size,size,size);
        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
