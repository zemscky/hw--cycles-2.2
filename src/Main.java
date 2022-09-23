public class Main {
    public static void main(String[] args) {
//        Домашняя работа 2
//        Задание 1,2
        System.out.println("Задание 1");
        int contribution = 15_000; // Вклад
        double accumulation = 0; // Накопления в месяц
        double precent = 0.07;
        int i = 1;
        for (;accumulation <= 12_000_000; i++) {
            accumulation = (accumulation + contribution) * (1 + precent);
            if (i % 6 ==0){
            System.out.println(i + " месяц, накопления составляют: " + String.format("%.2f", accumulation) + " рублей" );
            }
        }
        System.out.println("Всего понадобиться " + i + " месяцев");


    }

}