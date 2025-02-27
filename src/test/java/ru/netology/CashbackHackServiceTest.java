package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void AmountMoreThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void AmountLessThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(999);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void AmountEqualsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

}
