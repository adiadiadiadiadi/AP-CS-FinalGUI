import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.Array;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Render extends JPanel {
   @Override
   public void paint(Graphics g) {
      Graphics2D graphic2d = (Graphics2D) g;
      graphic2d.setColor(Color.BLACK);
      graphic2d.drawOval(40,40,10,10);
   }
   public static void main (String[] args) {
      JFrame frame = new JFrame("Demo");
      frame.add(new Render());
      frame.setSize(1500, 700);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
