package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StatsServiceTest {

    // Тест на сумму всех продаж
    @Test
    void shouldCalcAllSumm() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int summ = service.summAll(sales);
        int expected = 180;
        int k = 180;
        Assertions.assertEquals(expected, summ);
    }

    // Тест на среднюю сумму продаж в месяц
    @Test
    void shouldCalcAverageSumm() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int avrSumm = service.averageSumm(sales);
        int expected = 15;
        Assertions.assertEquals(expected, avrSumm);
    }

    // Тест на номер месяца, в котором был пик продаж
    @Test
    void shouldCalcMaxMounth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMounth = service.maxMounth(sales);
        int expected = 8;
        Assertions.assertEquals(expected, maxMounth);
    }

    // Тест на номер месяца, в котором был минимум продаж
    @Test
    void shouldCalcMinMounth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMounth = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, minMounth);
    }

    // Тест на количество месяцев, в которых продажи были ниже среднего
    @Test
    void shouldCalcAvrMinMounths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int avrMinMounth = service.avrMinMounth(sales);
        int expected = 5;
        Assertions.assertEquals(expected, avrMinMounth);
    }

    // Тест на количество месяцев, в которых продажи были выше среднего
    @Test
    void shouldCalcAvrMaxMounths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int avrMaxMounth = service.avrMaxMounth(sales);
        int expected = 5;
        Assertions.assertEquals(expected, avrMaxMounth);
    }
}
