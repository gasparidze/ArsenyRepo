package org.example.animal;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion(100 , "Africa" , "lion msk" , "orange");
        Tiger tiger1 = new Tiger(80 , "Africa" , "tiger spb" , "up");
        Monkey monkey1 = new Monkey(40 , "Africa" , "monkey ekb" , 10);
//        lion1.sayHello();
//        tiger1.sayHello();
//        monkey1.sayHello();

        /**
         * т.к. Lion, Tiger и Monkey - наслденики Animal, то допустима такая запись:
         * слева тип данных (Animal) и название переменной
         * справа - создание конкретного наследника класса Animal
         *
         * Наши объекты будут ограничены теми полями и методами, которые заданы в типе данных,
         * но если у нас есть методы, которые переопределяются в классе потомке, то будет браться реализация из класса-потомка
         */
        Animal lion2 = new Lion(120 , "Africa" , "lion msk" , "orange");
        Animal tiger2 = new Tiger(85 , "Africa" , "tiger spb" , "up");
        Animal monkey2 = new Monkey(42 , "Africa" , "monkey ekb" , 12);

//        lion2.sayHello();
//        tiger2.sayHello();
//        monkey2.sayHello();

        say(lion1);
        say(tiger1);
        say(monkey1);
    }

    /**
     * Т.к. Lion, Tiger, Monkey - это классы наследники от Animal,
     * то в качестве входного параметра в методе мы можем указать класс родитель и передавать туда классы наследники
     *
     */
    public static void say(Animal animal){
        // полиморфный вызов метода
        animal.sayHello();
    }

//    public static void say(Lion lion){
//        lion.sayHello();
//    }
//
//    public static void say(Tiger tiger){
//        tiger.sayHello();
//    }
//
//    public static void say(Monkey monkey){
//        monkey.sayHello();
//    }
}
