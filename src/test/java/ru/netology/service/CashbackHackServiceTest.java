package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashbackHackServiceTest {

    @Test
    /*
    проверяем, что при сумме равной 0 - нам тоже ничего не должны сказать,
    те мы должны получить 1000
    */
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 1000;
        int actualResult = service.remain(0);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    /*
    проверяем, что при сумме меньше 1000 - нам должны сказать
    на какую сумму нам надо еще положить чего-то в корзину,
    чтобы получить кэшбек. В случае 900 рублей в корзине -
    нам должны посоветовать добрать на 100 рублей
    */
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 100;
        int actualResult = service.remain(900);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    /*
    проверяем, что при сумме равной 1000 - нам ничего не должны сказать,
    те мы должны получить 0
    */
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 0;
        int actualResult = service.remain(1000);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    /*
    проверяем следующее граничное значение = берем 1100 и должны получить
    в качестве совета 900 рублей
    */
    void shouldReturn900IfAmountIs1100() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 900;
        int actualResult = service.remain(1100);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    /*
    проверяем, что при сумме равной 2000 - нам тоже ничего не должны сказать,
    те мы должны получить 0
    */
    void shouldReturn0IfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 0;
        int actualResult = service.remain(2000);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}