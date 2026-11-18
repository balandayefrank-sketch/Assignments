public class AverageCalculator {


    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("no numbers provided");
        }
        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum / numbers.length;
    }
}
