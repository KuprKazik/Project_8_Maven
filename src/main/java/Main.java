import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println("1. Сумма всех продаж: " + service.getSumSales(sales));
        System.out.println("2. Средняя сумма продаж в месяц: " + service.getAverageSales(sales));
        System.out.println("3. Номер месяца, в котором был пик продаж:" + service.maxSales(sales));
        System.out.println("4. Номер месяца, в котором был минимум продаж: " + service.minSales(sales));
        System.out.println("5. Количество месяцев, в которых продажи были ниже среднего: " + service.lowerThanAverageSales(sales));
        System.out.println("6. Количество месяцев, в которых продажи были выше среднего: " + service.higherThanAverageSales(sales));
    }
}
