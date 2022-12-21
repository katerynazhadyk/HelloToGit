package org.example;

public class Main {
    public static void main(String[] args) {
        new Main().run2();
    }

    private void run2() {
        String name = "Shirt";
        double prise = 450.50;
        System.out.printf("товар: %s, стоит: %f грн",name,prise);
    }

    private void run1() {
        int nBox = 3;
        int apples = 34;
        System.out.printf("в коробке %d лежит %d ябл ",nBox,apples);
    }

    private void run() {
        System.out.println("Hello world!");
    }

}
