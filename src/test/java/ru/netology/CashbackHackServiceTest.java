package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void AmountMoreThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void AmountLessThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmountEqualsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
