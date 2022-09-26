public class Main {
    public static void main(String[] args) {
//        Домашняя работа 2
//        Задание 1,2
        System.out.println("Задание 1,2");
        double contribution = 15_000; // Вклад
        int month = 0;
        int accumulate = 12_000_000;
        double precent = 0.07;
        while (contribution <= accumulate) {
            double percentageOfTheAmount = contribution * 0.07;
            contribution = contribution + percentageOfTheAmount;
            month++;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, накопления составляют: " + String.format("%.2f", contribution) + " рублей");
            }
        }
        System.out.println("Всего понадобиться " + month + " месяцев");
        //        Задание 3
        System.out.println("Задание 3");
        double contribution1 = 15_000;
        int timeOfAccumulation = 9 * 12;
        int month1 = 0;
        while (month1 <= timeOfAccumulation) {
            double interestRate = contribution1 * precent;
            contribution1 = contribution1 + interestRate;
            if (month1 % 6 == 0) {
                System.out.println(month1 + " месяц, накопления составляют: " + String.format("%.2f", contribution1) + " рублей");
            } month1++;
        } System.out.println("Всего понадобиться " + month1 + " месяцев");

        //        Задание 4
        System.out.println("Задание 4");
        for(int friday = 5;friday <= 31;friday += 7) {
            System.out.println("Сегодня пятница, " +friday+ "-е число. Необходимо подготовить отчет.");
        }
        }
}
