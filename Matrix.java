public class Matrix {
    public static double[] matrixAdd(double[] a, double[] b) {
        double[] additionMatrix = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            additionMatrix[i] = (double) a[i] + (double) b[i];
        }
        return additionMatrix;
    }

    public static double[] matrixSubtract(double[] a, double[] b) {
        double[] subtractionMatrix = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            subtractionMatrix[i] = (double) a[i] - (double) b[i];
        }
        return subtractionMatrix;
    }

    public static double[] force(double[] d) {
        double[] forceMatrix = new double[d.length];
        for (int i = 0; i < d.length; i++) {
            forceMatrix[i] = 1/(((double) d[i])*Math.abs((double) d[i]));
        }
        return forceMatrix;
    }

    
}
