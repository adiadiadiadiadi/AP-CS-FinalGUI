import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Date; 


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("started");

        //For some reason this doesn't work at the moment unless they are in the same line
        Particle A = new Particle(100,100, 0, 0, 1);
        Particle B = new Particle(500,500, 0, 0, 1);
        Particle C = new Particle(200,200, 0, 0, 1);
        Particle D = new Particle(300,300, 0, 0, 1);

        ArrayList<Particle> particles = new ArrayList<Particle>();	
        particles.add(A);
        particles.add(B);
        particles.add(C);
        particles.add(D);
        MyFrame frame = new MyFrame(particles);

        for (int x = 0; x < 100000; x++) {
            particles = Interaction.computeForce(particles);
            Interaction.updateVelocities(particles);
            Interaction.updatePositions(particles);

            frame.updatePanel(particles);
            Thread.sleep(3);
        }
	}   
}
