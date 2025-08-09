package org.example.oop;

public class Main {
    public static void main(String[] args) {
        /**
         * слева указываем тип данных (Human - класс) и переменную с этим типом данных
         * справа - создаем объект этого класса с помощью конструкции new Human()
         * ключевое слово new - выделяет место в оперативной памяти под наш новый объект и возвращает нам ссылку на этот объект,
         * сама же ссылка записывается в переменную
         * arseniy - это объект/экземпляр класса Human
         *
         */
        Human kate = new Human();
        Human arseniy = new Human("Arseniy", 22, 180, 80);
//        arseniy.name = "Arseniy";
//        arseniy.age = 22;
//        arseniy.height = 180;
//        arseniy.weight = 80;

        System.out.println(arseniy);

        Human artur = new Human("Artur", 26, 181, 72.2);

        int result1 = artur.function(2);
        System.out.println(result1);
        System.out.println(artur.function(3));

        Human polina = new Human("Polina");

    }
}
