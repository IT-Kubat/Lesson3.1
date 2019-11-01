package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, -9, 0, 45};
        System.out.println(numbers[3]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);
        System.out.println(numbers[5]);
        numbers[5] = 18;
        System.out.println(numbers[5]);
        System.out.println(numbers[2] + numbers[5]);

        String[] names = new String[3];
        names[0] = "Uluk";
        names[1] = "Mayrambek";
        names[2] = "Kunduz";
        System.out.println(names[0] + " " + names[1] + " " + names[2]);

        int[][] array2d = {{15, 6}, {45, 66}, {-9, -18}};
        System.out.println(array2d[1][1]);
        System.out.println(array2d[1][0]);





    }
}
