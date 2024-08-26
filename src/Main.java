public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1,2,3.Массив 1 ");

        double[] number2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number2.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(number2[i]);
        }
        for (int i = number2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number2[i] + " , ");
            } else {
                System.out.println(number2[i]);
            }
        }

        System.out.println(" Задача 1,2,3.Массив 2 ");

        int[] number1 = new int[]{1, 2, 3};
        for (int i = 0; i < number1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(number1[i]);
        }
        for (int i = number1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number1[i] + " , ");
            } else {
                System.out.println(number1[i]);
            }

            System.out.println(" Задача 1,2.3.Массив 3 ");

            int[] number3 = {1, 16, 29, 19, 34};
            for (int g = 0; g < number3.length; g++) {
                if (g > 0) {
                    System.out.print(", ");
                }
                System.out.print(number3[g]);
            }
            for (int g = number3.length - 1; g >= 0; g--) {
                if (g != 0) {
                    System.out.print(number3[g] + " , ");
                } else {
                    System.out.println(number3[g]);
                }
            }
        }
        System.out.println("Задача 4 ");
        int [] number11 = new int[] {1,2,3};
        for (int i = 0; i < number11.length; i++) {
            if (number11 [i] % 2 != 0){
                number11[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(number11[i]);
        }
    }
}