package org.example.core;

import org.example.base_syntax.Book;
import org.example.oop.Human;

public class IfExample {
    public static void main(String[] args) {
        Human arseniy = new Human();

        /**
         * Операторы if'а:
         * 1) == - проверка на равенство
         * 2) != - проверка на неравенство
         * 3) >, >=, <, <= - проверка на больше/меньше и т д
         * 4) && - логический оператор AND
         * condition1 && condition2 означает, что И первое И второе условие должны быть true
         * 5) || - логический оператор OR
         * condition1 && condition2 означает, что ИЛИ первое ИЛИ второе условие должны быть true
         * 6) ! - логическое отрицание
         * condition = true => !condition = false
         * condition = false => !condition = true
         *
         * Как работает if-else:
         * если выполнилось условие в if (true), то тогда блок if полностью заканчивается (не попадая в else)
         * если условие if не выполнилось (false), то тогда идем в else-if (если есть) и проверяем эти условия
         * если же не попали ни в один if, тогда паподаем в else
         *
         * 1) getBalance = 0 => мы попадаем в первый if, сетается 500 и все из if выходим (не попадая в else) и программа продолжается дальше
         * 2) getBalance = 1000 => попадаем в первый if, условие false => идем в else-if, там условие уже true => сетается 700 (не попадая в else) и выходим из if и программа продолжается дальше
         * 3) getBalance = 50 => попадаем в первый if, условие false, далее попадаем во второй if, условие также false
         * => ни одно из условий не выполнилось => попадаем в else и сетается 0, выходим из if и программа продолжается дальше
         *
         * Важно: мы в else попадаем только если ни одно из условий не выполнилось
         * если же выполнилось какое-то из условий, то в else не попадем
         * блок else - только один
         * блоков else-if - сколько угодно
         */

        arseniy.setBalance(100);

        if(arseniy.getBalance() == 0){
            arseniy.setBalance(500);
        } else if(arseniy.getBalance() == 1000){
            arseniy.setBalance(700);
        } else {
            arseniy.setBalance(0);
        }

        /**
         * Массив - упорядоченная структура данных
         * как создать массив:
         * формат: типданных[] название переменной = new типданных [кол-во элементов]
         */
        int[] arrayName = new int[10];
        boolean[] arrayMane = new boolean[10];

        /**
         * Цикл for с индексом
         * 1) здесь есть счетчик i, он при каджом проходе цикла увеличивается на единицу
         * создаем локальную переменную и присваиваем начальное значение 0 (индексация начинается с нуля): int i = 0
         * 2) далее прописываем условие до которого цикл подолжает работать, т.е. пока i меньше размера массив (arrayName.length)
         * если length = 10, то последний индекс = 9
         * 3) i++ - увеличение счетчка на единицу (инкремент)
         */
        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = i*2;
        }

        /**
         * for без счетчика
         * слева локальная переменная, в которую на каждой итерации помещается элемент из массива справа
         */
        for (int i : arrayName) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        /**
         * цико while - работает пока выполнено заданное условие
         */
        int i = 0; // индекс
        while (i < arrayName.length){
            System.out.println(arrayName[i]);
            i++;
        }


        System.out.println("--------------------------");
        /**
         * цикл do-while - работает пока выполнено заданное условие, но в отличие от while
         * первый раз в цикл заходит без условия
         */
        int j = 0;
        do {
            System.out.println(arrayName[j]);
            j++;
        } while (j < arrayName.length);

        System.out.println("---------------------------------------");

        Book[] books = new Book[3];
        books[0] = new Book("Петров", "Пушкин");
        books[1] = new Book("Сидоров", "Лермонтов");
        books[2] = new Book("Фролов", "Толстой");

        test(books);
    }

    /**
     * authors - это название локальной переменной, в которой лежит переданные массив при вызове метода test
     * String[] - это тип данных, т.е. массив String'ов
     *
     * books: [Петров, Пушкин], [Сидоров, Лермонтов], [Фролов, Толстой]
     * books[0] = [Петров, Пушкин]
     * books[1] = [Сидоров, Лермонтов]
     * books[2] = [Фролов, Толстой]
     */
    public static void test(Book[] books){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " взял книгу " + books[i].getAuthorName());
        }
    }
}
