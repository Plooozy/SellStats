package ru.netology.stats;

public class StatsService {
    public int summAll(int[] sales) {
        int summ = 0; // Задаём сумму равную нулю, потом будем к ней прибавлять сумму за каждый месяц
        for (int i : sales) { // Цикл "for each" в котором i принимает значения каждого месяца из массива "sales"
            summ = summ + i;
        }
        return summ;
    }

    public int averageSumm(int[] sales) {
        return summAll(sales) / sales.length; // Формула использует общую сумму из прошлого метода и длинну массива "sales"
    }

    public int maxMounth(int[] sales) {
        int maxMounth = 0; // начальный номер месяца с максимальными продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMounth]) { //в рассматриваемом i-м месяце продаж больше
                maxMounth = i; // запоминаем месяц как максимальный
            }
        }
        return maxMounth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
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

    public int avrMinMounth(int[] sales) {
        int i = 0; // заводим счётчик месяцев
        for (int t : sales) { // цикл "for each" перебирает значения массива "sales"
            if (t < averageSumm(sales)) { // проверяем меньше ли значение "t" чем среднее значение продаж за все месяцы
                i++; // увеличиваем счетчик месяцев на 1
            }
        }
        return i;
    }

    public int avrMaxMounth(int[] sales) {
        int i = 0; // заводим счётчик месяцев
        for (int t : sales) { // цикл "for each" перебирает значения массива "sales"
            if (t > averageSumm(sales)) { // проверяем больше ли значение "t" чем среднее значение продаж за все месяцы
                i++; // увеличиваем счетчик месяцев на 1
            }
        }
        return i;
    }
}
