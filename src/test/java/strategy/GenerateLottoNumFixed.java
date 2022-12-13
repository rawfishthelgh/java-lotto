package strategy;

import domain.strategy.GenerateLottoNum;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GenerateLottoNumFixed implements GenerateLottoNum {

  @Override
  public List<Integer> generate() {
    List<Integer> lottoBalls = new ArrayList<>();
    IntStream.rangeClosed(1,6).forEach(
        i -> lottoBalls.add(i)
    );
    return lottoBalls;
  }
}
