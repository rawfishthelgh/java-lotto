package domain.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LottoNumber {

  private static final int MINIMUM_NUMBER = 1;
  private static final int MAXIMUM_NUMBER = 45;

  public static final List<Integer> lottoNumbers = new ArrayList<>();

  static {
    IntStream.rangeClosed(MINIMUM_NUMBER,MAXIMUM_NUMBER)
        .forEach(
            i -> lottoNumbers.add(i)
        );
  }
}