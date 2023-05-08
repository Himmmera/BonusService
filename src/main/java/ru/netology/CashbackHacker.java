package ru.netology;

public class CashbackHacker {

    public class CashbackHack {
        private final int boundary = 1000;

        public int remain(int amount) {
            return boundary - amount % boundary;
        }
    }
}
