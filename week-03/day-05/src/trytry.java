import java.awt.*;
import java.util.Random;

public class trytry {


    public  void drawSquareGrid2 (Graphics graphics22, int startXPos, int startYPos, int squareLenght, int counter,
                                       float strokeSize) {

        if (counter>0) {
            Graphics graphics2 = (Graphics2D) graphics22;

            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);

            graphics2.setColor(randomColor);

            int x = startXPos - squareLenght / 2;
            int y = startYPos - squareLenght / 2;

            counter = counter-1;


            ((Graphics2D) graphics2).setStroke(new BasicStroke(strokeSize));

            graphics2.drawRect(x, y, squareLenght, squareLenght);

            drawSquareGrid2(graphics2, x, y, squareLenght / 2,counter,strokeSize/2);
            drawSquareGrid2(graphics2, x+squareLenght, y, squareLenght / 2,counter,strokeSize/2);
            drawSquareGrid2(graphics2, x+squareLenght, y+squareLenght, squareLenght / 2,counter,strokeSize/2);
            drawSquareGrid2(graphics2, x, y+squareLenght, squareLenght / 2,counter,strokeSize/2);

        }


    }
}
