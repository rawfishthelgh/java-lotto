package view;

import domain.lotto.Lotto;
import domain.lotto.Lottos;
import java.util.HashMap;
import java.util.Map;

public class ResultView {

  private static final int MIN_INDEX = 3;
  private static final int MAX_INDEX = 6;

  private static final Map<Integer, Integer> prizePerCount = new HashMap<>();

  public static void printLottoAmount(int amount) {
    System.out.println(amount + "개를 구매했습니다");
  }

  public static void printMyLotto(Lottos lottos) {
    for (Lotto lotto : lottos.lottos) {
      System.out.println(lotto.lotto.toString());

    }
  }

  public static void showPrizeStatistics(Map<Integer, Integer> prizeMap, float revenueRatio) {
    System.out.println("당첨 통계");
    System.out.println("---------");
    initPrizePerCount();
    for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
      System.out.println(i + "개 일치 (" + prizePerCount.get(i) + "원)-" + prizeMap.get(i) + "개");
    }
    System.out.println("총 수익률은" + revenueRatio + "입니다.");
  }

  private static void initPrizePerCount() {
    prizePerCount.put(3, 5000);
    prizePerCount.put(4, 50000);
    prizePerCount.put(5, 1500000);
    prizePerCount.put(6, 2000000000);
  }
}