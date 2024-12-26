import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();

        System.out.println("Задача 1");
        // Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);
        System.out.println();

        // Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        float[] weight = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }
        System.out.println();

        // Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] week = {0, 1, 2, 3, 4, 5, 6};
        int mondayWeek = week[0];
        int tuesdayWeek = week[1];
        int wednesdayWeek = week[2];
        int thursdayWeek = week[3];
        int fridayWeek = week[4];
        int saturdayWeek = week[5];
        int sundayWeek = week[6];
        System.out.println(week[0]);
        System.out.println(week[1]);
        System.out.println(week[2]);
        System.out.println(week[3]);
        System.out.println(week[4]);
        System.out.println(week[5]);
        System.out.println(week[6]);
        System.out.println();

        System.out.println("Задача 2");
        // Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        System.out.println(week[0] + ", " + week[1] + ", " + week[2] + ", " + week[3] + ", " + week[4] + ", " + week[5] + ", " + week[6]);
        System.out.println(Arrays.toString(weights));
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(week));

        System.out.println();

        System.out.println("Задача 3");
        // Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        System.out.println(Arrays.toString(weights));
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(weight));
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //Распечатайте результат преобразования в консоль.
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i] = weights[i] + 1;
                {
                }
            }
        }
        System.out.println(Arrays.toString(weights));


    }
}