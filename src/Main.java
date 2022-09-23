public class Main {
    public static void main(String[] args) {
//        Домашняя работа 2
//        Задание 1,2
        System.out.println("Задание 1,2");
        double contribution = 15_000; // Вклад
        int i = 0;
        while (contribution <= 12_000_000) {
            double precent = contribution * 0.07;
            contribution = contribution + precent;
            i++;
            if (i % 6 == 0) {
                System.out.println(i + " месяц, накопления составляют: " + String.format("%.2f", contribution) + " рублей");
            }
        }
        System.out.println("Всего понадобиться " + i + " месяцев");


        //        Задание 3
        System.out.println("Задание 3");
        double deposit = 15_000;
        // 9 лет = 108 месяцев
        int f = 0;
        while (f <= 108) {
            double interestRate = deposit * 0.07;
            deposit = deposit + interestRate;
            f++;
            if (f % 6 == 0) {
                System.out.println(f + " месяц, накопления составляют: " + String.format("%.2f", deposit) + " рублей");
            }
        } System.out.println("Всего понадобиться " + f + " месяцев");
        //        Задание 4
        System.out.println("Задание 4");
        for(int friday = 5;friday <= 31;friday += 7) {
            System.out.println("Сегодня пятница, " +friday+ "-е число. Необходимо подготовить отчет.");
        }
        }
}
