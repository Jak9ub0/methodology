package com.sda.arppl2;

public class Main {

    public static void name(String bearName) {
        System.out.println("Imię misia: "+bearName);
    }

    public static void age(int bearAge) {
        System.out.println("Wiek misia: "+bearAge);
    }
    public static void main(String[] args) {

        Main Bear = new Main();
        Bear.name("Marian");
        Bear.age(32);

        Bear.name("Olek");
        Bear.age(2);

        Bear.name("Filipek");
        Bear.age(10);

        Bear.name("Teddy");
        Bear.age(3);
    }
}
