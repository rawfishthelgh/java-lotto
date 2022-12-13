package domain.lotto;

public class LottoPieces {

    private final int MONEY_UNIT = 1000;
    public int pieces;

    public LottoPieces(int payment) {
        validatePrice(payment);
        int pieces = payment / MONEY_UNIT;
        this.pieces = pieces;
    }

    private void validatePrice(int amount) {
        if (amount % MONEY_UNIT != 0) {
            throw new IllegalArgumentException("1000원 단위로만 구매할 수 있습니다");
        }
    }

}
