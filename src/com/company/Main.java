package com.company;

public class Main {
    public static void main(String[] args) {
        String names;
        for(int name = 0; name <= 3; name++) {
            switch (name) {
                case 1:
                    names = "Ilon1 ";
                    System.out.println(names + "Доброе утро!");
                    break;
                case 2:
                    names = "Ilon2 ";
                    System.out.println(names + "Добрый день!");
                    break;
                case 3:
                    names = "Ilon3 ";
                    System.out.println(names + "Добрый вечер!");
                    break;
            }
        }

    }
}
