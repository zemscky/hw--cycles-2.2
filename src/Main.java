public class Main {
    public static void main(String[] args) {
//        Домашняя работа 2
//        Задание 1,2
        System.out.println("Задание 1,2");
        double contribution = 15_000; // Вклад
        int i = 0;
        while (contribution <= 12_000_000) {
            double precent = contribution * 0.07;
            contribution = contribution + precent ;
            i++;
            if (i % 5 == 0) {
                System.out.println(i + " месяц, накопления составляют: " + String.format("%.2f", contribution) + " рублей" );
            }
        }
        System.out.println("Всего понадобиться " + i + " месяцев");

            }
        }

    }

}