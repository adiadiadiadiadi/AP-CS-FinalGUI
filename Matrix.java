public class Matrix {
    public static double[] matrixAdd(double[] a, double[] b) {
        double[] additionMatrix = a;
        for (int i = 0; i < a.length; i++) {
            additionMatrix[i] += b[i];
        }
        return additionMatrix;
    }

    public static double[] matrixSubtract(double[] a, double[] b) {
        double[] subtractionMatrix = a;
        for (int i = 0; i < a.length; i++) {
            subtractionMatrix[i] += b[i];
        }
        return subtractionMatrix;
    }

    public static double[] force(double[] d) {
        double[] forceMatrix = d;
        for (int i = 0; i < d.length; i++) {
            forceMatrix[i] = 1/((forceMatrix[i])*Math.abs(forceMatrix[i]));
        }
        return forceMatrix;
    }

    
}
