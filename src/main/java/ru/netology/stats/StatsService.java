package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }

        return sum;
    }
    public int getAverageSum(int[] sales) {
        int numberMonths = sales.length;
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        int averageSum = sum / numberMonths;
        return averageSum;
    }
    public int getMonthMaxSales(int[] sales) {
        int numberMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[numberMaxSales]) {
                numberMaxSales = i;

            }
        }
        return numberMaxSales;
    }
    public int getMonthMinSales(int[] sales) {
        int numberMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[numberMinSales]) {
                numberMinSales = i;

            }
        }
        return numberMinSales;
    }
    public int getNumberMonthsBelowAverage(int[] sales) {
        int numberMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSum(sales))
                numberMonths ++;

        }
        return numberMonths;
    }
    public int getNumberMonthsAboveAverage(int[] sales) {
        int numberMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSum(sales))
                numberMonths ++;

        }
        return numberMonths;
    }
}
