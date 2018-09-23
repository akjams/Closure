import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Closure {

  public static void main(String[] args) {
    Supplier<Integer> c1 = makeCounter();
    Supplier<Integer> c2 = makeCounter();
    
    System.out.printf("c1: %d\n", c1.get());
    System.out.printf("c2: %d %d %d\n", c2.get(), c2.get(), c2.get());
    System.out.printf("c1: %d %d\n", c1.get(), c1.get());
  }

  static Supplier<Integer> makeCounter() {
    // Use AtomicInteger instead of int because closures 
    // can only reference effectively final variables
    AtomicInteger count = new AtomicInteger();
    Supplier<Integer> incrementAndGet = () -> {
      return count.incrementAndGet();
    };
    return incrementAndGet;
  }
}