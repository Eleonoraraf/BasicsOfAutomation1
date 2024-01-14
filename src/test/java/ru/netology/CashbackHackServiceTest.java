package ru.netology;

import org.testng.annotations.Test;
import ru.netology.CashbackHackService;


import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void test() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}