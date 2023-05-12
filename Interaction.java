import java.util.ArrayList;

public class Interaction {
    public static ArrayList<Particle> computeForce(ArrayList<Particle> particles) {
        ArrayList<Particle> newParticles = new ArrayList<Particle>();
        for (int i = 0; i < particles.size(); i++) {
            double[] totalForce = new double[2];
            for (int j = 0; j < particles.size(); j++) {
                if (i==j) {continue;}
                double[] distance = Matrix.matrixSubtract(particles.get(i).getPosition(), particles.get(j).getPosition());
                
                if (Matrix.force(distance)==null) {
                    //collision code if it gets too close
                    double[] v1 = particles.get(i).getVelocity();
                    double[] v2 = particles.get(j).getVelocity();
                    particles.get(i).setVelocity(v2);
                    particles.get(j).setVelocity(v1);
                    System.out.println("did a thing");
                }
                else {
                    totalForce = Matrix.matrixAdd(totalForce, Matrix.force(distance));
                }

            }
            particles.get(i).setAcceleration(totalForce);
            newParticles.add(particles.get(i));
        }
        return newParticles;
    }

    public static void updateVelocities(ArrayList<Particle> particles) {
        for (Particle particle : particles) {
            particle.updateVelocity();
        }
    }

    public static void updatePositions(ArrayList<Particle> particles) {
        for (Particle particle : particles) {
            particle.updatePosition();
        }
    }
}
