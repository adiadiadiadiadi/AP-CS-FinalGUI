import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Date; 


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("started");
        double[] a = {5,2};
        double[] b = {2,3};
        System.out.println(Matrix.matrixAdd(a, b)[0]);
        System.out.println(Matrix.matrixSubtract(a, b)[0]);
        System.out.println(Matrix.force(a)[0]);

        Particle A = new Particle(300,500);
        Particle B = new Particle(500,300);
        ArrayList<Particle> particles = new ArrayList<Particle>();	
        particles.add(A);
        particles.add(B);
        new Render(particles);
        Thread.sleep(4000);
        for (int x = 0; x < 1; x++) {
            particles = Interaction.computeForce(particles);
            Interaction.updateVelocities(particles);
            Interaction.updatePositions(particles);
            new Render(particles);
            Thread.sleep(1000);
        }
	}   
}
