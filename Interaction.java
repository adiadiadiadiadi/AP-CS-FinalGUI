import java.util.ArrayList;

public class Interaction {
    public static ArrayList<Particle> computeForce(ArrayList<Particle> particles) {
        ArrayList<Particle> newParticles = new ArrayList<Particle>();
        for (int i = 0; i < particles.size(); i++) {
            double[] totalForce = new double[2];
            for (int j = 0; j < particles.size() && j!=i; j++) {
                double[] distance = Matrix.matrixSubtract(particles.get(i).getPosition(), particles.get(i).getPosition());
                totalForce = Matrix.matrixAdd(totalForce, Matrix.force(distance));
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
