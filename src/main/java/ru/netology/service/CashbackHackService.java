package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        /*
        % - оператор остатка от деления:
        вычисляет остаток от деления одного числа на другое
        */
        return boundary - amount % boundary;
    }
}
