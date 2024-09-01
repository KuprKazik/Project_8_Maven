package ru.netology.stats;

public class StatsService {

    public long getSumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long getAverageSales(long[] sales) {
        long averageSales = getSumSales(sales) / sales.length;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int lowerThanAverageSales(long[] sales) {
        int count = 0;
        int lowMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSales(sales)) {
                count++;
                lowMonths = i;
            }
        }
        return count;
    }

    public int higherThanAverageSales(long[] sales) {
        int count = 0;
        int highMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSales(sales)) {
                count++;
                highMonths = i;
            }
        }
        return count;
    }
}
