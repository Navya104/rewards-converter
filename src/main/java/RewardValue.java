public class RewardValue {
    Double cashValue;
    int milesValue;

    // Conversion rate between miles and cash
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that accepts cash value
    RewardValue(Double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Constructor that accepts miles value
    RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Getter for cash value
    Double getCashValue() {
        return this.cashValue;
    }

    // Getter for miles value
    int getMilesValue() {
        return this.milesValue;
    }
}

