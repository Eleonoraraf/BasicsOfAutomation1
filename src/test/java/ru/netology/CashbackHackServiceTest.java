package ru.netology;

import org.testng.annotations.Test;
import ru.netology.CashbackHackService;


import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void test() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
}