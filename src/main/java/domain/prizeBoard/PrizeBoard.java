package domain.prizeBoard;

public enum PrizeBoard {
  MATCH3(3, 5000),
  MATCH4(4, 50000),
  MATCH5(5, 1500000),
  MATCH6(6, 2000000000);

  private final int matchNum;
  private final int money;

  PrizeBoard(int matchNum, int money) {
    this.matchNum = matchNum;
    this.money = money;
  }

  public Integer matchPrize() {
    return this.money;
  }
}
