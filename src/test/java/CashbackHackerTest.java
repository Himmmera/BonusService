import ru.netology.CashbackHacker;

import static org.junit.Assert.*;


    public class CashbackHackerTest {
        @org.junit.Test
        public void testRemain() {
            CashbackHacker service = new CashbackHacker();
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;
            assertEquals(expected, actual);
        }
        @org.junit.Test
        public void testRemainWithCashback() {
            CashbackHacker service = new CashbackHacker();
            int amount = 900;
            int actual = service.remain(amount);
            int expected = 100;
            assertEquals(expected, actual);
        }
        @org.junit.Test
        public void testRemain1() {
            CashbackHacker service = new CashbackHacker();
            int amount = 0;
            int actual = service.remain(amount);
            int expected =1000;
            assertEquals(expected, actual);
        }


    }