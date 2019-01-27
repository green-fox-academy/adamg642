import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {


        DrawingTrianglesPyramid(WIDTH,HEIGHT,10,10,32,graphics);
    }

    public static void DrawingTrianglesPyramid (int StartXpos,int StartYpos,int triangleHeight,int triangleLong,
                                                int trianglesMaxNum,Graphics graphics2) {

        for (int k = 0; k < trianglesMaxNum; k++) {
            int minusPortion = 0;
            minusPortion = minusPortion +k;

            if (k > 0) {
                StartXpos = StartXpos - (triangleLong / 2);
            }

            for (int i = 0; i < trianglesMaxNum - minusPortion; i++) {
                int xPush = -triangleLong * i;
                int yPush = -triangleHeight*k;

                int[] xPositions = {StartXpos + xPush ,StartXpos-(triangleLong/2)+xPush,StartXpos-triangleLong+xPush};
                int[] yPositions = {StartYpos + yPush, StartYpos-triangleHeight+yPush, StartYpos+yPush};

                graphics2.drawPolygon(xPositions, yPositions, 3);

                }
            }

        }

        public static void DrawingOneTriangle (){


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