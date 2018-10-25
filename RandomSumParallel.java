
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadLocalRandom;

public class RandomSumParallel {
  public static void main(String... args) throws Exception {
    long startedAt = System.nanoTime();

    double sum = DoubleStream.generate(() -> ThreadLocalRandom.current().nextDouble())
        .parallel()
        .limit(100000000)
        .sum();

    System.out.printf("Elapsed: %.4g sec%n", (System.nanoTime() - startedAt) / 1e9f);
    System.out.println("Result: " + sum);
  }
}
