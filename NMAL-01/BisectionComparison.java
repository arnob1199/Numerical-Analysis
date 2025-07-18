public class BisectionComparison {

    static double tolerance = 0.0001;

    public static double f(double x) {
        return 4 * x * x + 3 * x - 3;
    }

    public static int traditionalBisection(double a, double b) {
        int count = 0;
        double mid;
        while (Math.abs(b - a) >= tolerance) {

            count++;
            mid = (a + b) / 2;

            if (f(mid) == 0.0) {
                break;
            }
            else if (f(mid) * f(a) < 0) {
                b = mid;
            }
            else {
                a = mid;
            }
        }

        return count;
    }

    public static int improvedBisection(double start, double end, double step) {
        double a = start, b = start + step;
        boolean found = false;

        while (b <= end) {
            if (f(a) * f(b) < 0) {
                found = true;
                break;
            }

            a = b;
            b += step;
        }

        if (!found) {
            System.out.println("No root found in the scanned range.");
            return -1;
        }

        int count = 0;
        double mid;

        while (Math.abs(b - a) >= tolerance) {

            count++;

            mid = (a + b) / 2;

            if (f(mid) == 0.0) {
                break;
            } 
            else if (f(mid) * f(a) < 0) {
                b = mid;
            } 
            else {
                a = mid;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int iter1 = traditionalBisection(0, 1);
        System.out.println("Traditional Method Iterations: " + iter1);

        int iter2 = improvedBisection(-10, 10, 0.1);

        if (iter2 != -1) {
            System.out.println("Improved Method Iterations: " + iter2);
        }
    }
}
