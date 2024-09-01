package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    void shouldFindSumOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.getSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.getAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindNumberOfMonthWithMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindNumberOfMonthWithMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindQuantityOfMonthsWithLowAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lowerThanAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindQuantityOfMonthsWithHighAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.higherThanAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}
