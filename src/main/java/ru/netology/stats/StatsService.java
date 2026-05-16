package ru.netology.stats;

public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long sum = 0;
        for (long eachSale : sales) {
            sum = sum + eachSale;
        }
        return sum;
    }

    public long averageAmountPerMonth(long[] sales) {
        long sum = sumOfAllSales(sales);
        long averageAmount = sum / sales.length;
        return averageAmount;
    }

    public int peakSalesDay(long[] sales) {
        int maxSalesDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesDay]) {
                maxSalesDay = i;
            }
        }
        return maxSalesDay + 1;
    }

    public int minSalesDay(long[] sales) {
        int minSalesDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesDay]) {
                minSalesDay = i;
            }
        }
        return minSalesDay + 1;
    }

    public int salesLessThanAverage(long[] sales) {
        long avg = averageAmountPerMonth(sales);
        int lessAverageDays = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                lessAverageDays++;
            }
        }
        return lessAverageDays;
    }

    public int salesMoreThanAverage(long[] sales) {
        long avg = averageAmountPerMonth(sales);
        int moreAverageDays = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                moreAverageDays++;
            }
        }
        return moreAverageDays;
    }
}

