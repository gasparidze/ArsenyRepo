package org.example.animal;

/**
 * Monkey extends Animal - говорит о том, что Monkey наследуется от Animal
 * super - это ссылка на суперкласс (класс-родитель)
 * super(param1, .. param2) - так вызывается конструктор класса родителя
 * super.field - обращаемся к полю класса родителя
 * super.method() - обращаемся к методу класса родителя
 */
public class Monkey extends Animal{
    private int quantityOfBananas;

    public Monkey(double weight , String environment , String nickname , int quantityOfBananas) {
        super(weight , environment , nickname);
        this.quantityOfBananas = quantityOfBananas;
    }

    @Override
    public void sayHello() {
        System.out.println("hello from monkey");
    }

    public int getQuantityOfBananas() {
        return quantityOfBananas;
    }

    public void setQuantityOfBananas(int quantityOfBananas) {
        this.quantityOfBananas = quantityOfBananas;
    }
}
