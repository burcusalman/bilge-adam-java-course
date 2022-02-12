package com.bilgeadamakademi;

import com.bilgeadamakademi.abstraction.model.Building;
import com.bilgeadamakademi.abstraction.model.Lion;
import com.bilgeadamakademi.abstraction.model.base.Animal;

public class Main {

    public static void main(String[] args) {
        //Animal object = new Lion(100,100);
        Building object = new Building();
        System.out.println(object.heightCm());
        System.out.println(object.heightM());
        System.out.println(object.heightKm());

        Animal snake = new Animal() {
            @Override
            public boolean isAlive() {
                return false;
            }

            @Override
            public double heightCm() {
                return 0;
            }

            @Override
            public double heightM() {
                return 0;
            }

            @Override
            public double weightGram() {
                return 0;
            }

            @Override
            public double weightKilogram() {
                return 0;
            }
        };
    }
}
