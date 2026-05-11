import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void ShouldCalculateSumOfAllSales () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void ShouldCalculateAverageAmountPerMonth () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageAmount = 15;
        long actualAverageAmount = service.averageAmountPerMonth(sales);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void ShouldCalculatePeakDayOfSales () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedPeakDay = 8;
        long actualPeakDay = service.peakSalesDay(sales);

        Assertions.assertEquals(expectedPeakDay, actualPeakDay);
    }

    @Test
    public void ShouldFindMinimumSalesDay () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinimumDay = 9;
        long actualMinimumDay = service.minSalesDay(sales);

        Assertions.assertEquals(expectedMinimumDay, actualMinimumDay);
    }

    @Test
    public void shouldCountNumberOfMonthsWhenSalesWereBelowAverage () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthNumberLess = 5;
        long actualMonthNumberLess = service.salesLessThanAverage(sales);

        Assertions.assertEquals(expectedMonthNumberLess, actualMonthNumberLess);
    }

    @Test
    public void ShouldCountNumberOfMonthsWhenSalesWereMoreThanAverage () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthNumberMore = 5;
        long actualMonthNumberMore = service.salesMoreThanAverage(sales);

        Assertions.assertEquals(expectedMonthNumberMore, actualMonthNumberMore);
    }
}
