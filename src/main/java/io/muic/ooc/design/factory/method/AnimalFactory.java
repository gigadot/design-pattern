/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.factory.method;

import io.muic.ooc.design.factory.method.animal.Rabbit;
import io.muic.ooc.design.factory.method.animal.Fox;
import io.muic.ooc.design.factory.method.animal.Animal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gigadot
 */
public class AnimalFactory {

    public static Animal createAnimal1(String animalType, String name) {
        switch (animalType) {
            case "rabbit":
                Rabbit rabbit = new Rabbit();
                rabbit.setName(name);
                return rabbit;
            case "fox":
                Fox fox = new Fox();
                fox.setName(name);
                return fox;
            default:
                return null;
        }
    }

    public static Animal createAnimal2(String animalType, String name) {
        Animal animal = null;
        switch (animalType) {
            case "rabbit":
                animal = new Rabbit();
                animal.setName(name);
            case "fox":
                animal = new Fox();
                animal.setName(name);
            default:
        }
        return animal;
    }

    public static Animal createAnimal3(Class<? extends Animal> animalClass, String name) {
        Animal animal = null;
        try {
            animal = animalClass.newInstance();
            animal.setName(name);
        } catch (InstantiationException | IllegalAccessException ex) {
        }
        return animal;
    }

    private static Map<String, Class<? extends Animal>> registeredAnimalClasses
            = new HashMap<String, Class<? extends Animal>>() {
        {
            put("rabbit", Rabbit.class);
            put("fox", Fox.class);
        }
    };

    public static Animal createAnimal4(String animalType, String name) {
        Class<? extends Animal> animalClass = registeredAnimalClasses.get(animalType);
        Animal animal = null;
        try {
            animal = animalClass.newInstance();
            animal.setName(name);
        } catch (InstantiationException | IllegalAccessException ex) {
        } catch (NullPointerException npe) {
            System.out.println("Not found animalType: " + animalType);
        }
        return animal;
    }

}
