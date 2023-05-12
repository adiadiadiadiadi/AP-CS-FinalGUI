import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.Array;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Render extends JFrame {  
   private ArrayList<Particle> particleRender;
   public Render(ArrayList<Particle> particles) {
      super("My Frame");
      particleRender = particles;

      // You can set the content pane of the frame to your custom class.
      setContentPane(new DrawPane());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true); 
   }

   // Create a component that you can actually draw on.
   class DrawPane extends JPanel {
        public void paintComponent(Graphics g) {
            for (Particle particle : particleRender) {
               g.drawOval((int) particle.getPosition()[0], (int) particle.getPosition()[1], 10, 10);
               System.out.println(particle.getPosition()[0]);
               System.out.println(particle.getVelocity()[0]);
               System.out.println(particle.getAcceleration()[0]);
            }
        }
   }
}