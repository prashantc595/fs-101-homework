package com.mk.xebia.solid.lsp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void test(){
        List<Animal> animals = new ArrayList<Animal>();
        NoTailCreature tail = new NoTailCreature();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Human());
        animals.add(new Snake());
        
       
        for(Animal animal:animals){
            System.out.print("Hi! My name is " + animal.getName());
            System.out.print(" I make the following sound : "+ animal.getSound());
            System.out.println(" I am proud of my :" +  tail.getTail().getName() + " and " + animal.getVocalChords().getName());
            System.out.println();
        }
    }

}