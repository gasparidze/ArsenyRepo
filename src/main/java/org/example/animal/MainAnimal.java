package org.example.animal;

public class MainAnimal {
    public static void main(String[] args) {
        Lion lion1 = new Lion(100 , "Africa" , "lion msk" , "orange");
        Tiger tiger1 = new Tiger(80 , "Africa" , "tiger spb" , "up");
        Monkey monkey1 = new Monkey(40 , "Africa" , "monkey ekb" , 10);

        Zoo zoo = new Zoo();
        zoo.addAnimal(lion1);
        zoo.addAnimal(tiger1);
        zoo.addAnimal(monkey1);

        zoo.displayInfo();
        zoo.callMakeSound();
    }
}
