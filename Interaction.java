import java.util.ArrayList;

public class Interaction {
    public static void computeForce(ArrayList<Particle> particles) {
        ArrayList<double[]> forceMatrix = new ArrayList<double[]>();

        for (int i = 0; i < particles.size(); i++) {
            double[] totalForce = new double[2];

            for (int j = 0; j < particles.size() && j!=i; j++) {
                double[] distance = Matrix.matrixSubtract(particles.get(i).getPosition(), particles.get(i).getPosition());
                totalForce = Matrix.matrixAdd(totalForce, Matrix.force(distance));
            }

            particles.get(i).setPosition(totalForce);
        }
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
