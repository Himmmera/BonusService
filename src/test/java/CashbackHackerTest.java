import ru.netology.CashbackHacker;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    public class CashbackHackerTest {
        @org.testng.annotations.Test
        public void testRemain() {
            CashbackHacker service = new CashbackHacker();
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;
            assertEquals(actual, expected);
        }
        @org.testng.annotations.Test
        public void testRemainWithCashback() {
            CashbackHacker service = new CashbackHacker();
            int amount = 900;
            int actual = service.remain(amount);
            int expected = 100;
            assertEquals(actual, expected);
        }
        @org.testng.annotations.Test
        public void testRemain1() {
            CashbackHacker service = new CashbackHacker();
            int amount = 0;
            int actual = service.remain(amount);
            int expected =1000;
            assertEquals(actual, expected);
        }


    }