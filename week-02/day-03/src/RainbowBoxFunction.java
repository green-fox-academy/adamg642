import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        //ArrayList<Color> cols = new ArrayList<>();
        Color purple = new Color(75,0,130);
        Color indigo = new Color(238,130,238);
        Color[] cols = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, purple, indigo};

        for (int i = 0 ; i < 7 ; i ++) {
            rainbowDraw(320-i*15, cols[i], graphics);
        }

    }
    public static void rainbowDraw (int size,Color col,Graphics graphics2) {
        //graphics2.drawRect(size,size,size,size);

        graphics2.setColor(col);
        graphics2.fillRect((WIDTH/2)-(size/2),(HEIGHT/2)-(size/2),size,size);
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
