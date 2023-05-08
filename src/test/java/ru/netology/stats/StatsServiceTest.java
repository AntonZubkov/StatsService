package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSalesYear () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.getSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void AverageSumYear () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSum = 15;
        int actualAverageSum = service.getAverageSum(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void MonthMaxSales () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMaxSales = 7;
        int actualMonthMaxSales = service.getMonthMaxSales(sales);

        Assertions.assertEquals(expectedMonthMaxSales, actualMonthMaxSales);
    }

    @Test
    public void MonthMinSales () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMinSales = 8;
        int actualMonthMinSales = service.getMonthMinSales(sales);

        Assertions.assertEquals(expectedMonthMinSales, actualMonthMinSales);
    }

    @Test
    public void NumberMonthsBelowAverage () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMonths = 5;
        int actualNumberMonths = service.getNumberMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedNumberMonths, actualNumberMonths);
    }

    @Test
    public void NumberMonthsAboveAverage () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMonths = 5;
        int actualNumberMonths = service.getNumberMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedNumberMonths, actualNumberMonths);
    }
}
