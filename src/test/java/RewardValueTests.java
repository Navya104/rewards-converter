import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        // Convert 100 cash to miles, should be 100 / 0.0035 = 28571 (approximately)
        int expectedMilesValue = (int) (cashValue / 0.0035);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        // Convert 10000 miles to cash, should be 10000 * 0.0035 = 35.0
        double expectedCashValue = milesValue * 0.0035;
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
