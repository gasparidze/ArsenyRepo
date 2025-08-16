package org.example.animal;

/**
 * Наследование - принцип ООП, согласно которому объекто производного класса (класса-потомка) может наследовать
 * поведения (т.е. методы) и состояния (т.е. переменные) базового класса (класса-родителя).
 * Это позволяет программисту создавать похожие объекты без повторного переопределения характеристик.
 *
 * Полиморфизм - это способность метода работать с данными разных типов.
 * Полиморфизм - некоторый принцип, который позволяет одному и тому же фрагменту кода работать с разными типами данных.
 * Без наследования полиморфизм был бы невозоможен.
 * Существует 2 типа полиморфизма:
 * 1) ad-hoc (ложный/мнимый) полиморфизм - это перегрузка методов
 * 2) параметрический (истинный) полиморфизм
 *
 * Абстрактный класс - это некий чертеж/макет, в него выносятся базовые характеристики и поведения (методы) для всех классов наследников
 * Абстрактный метод - это метод-макет, у него нет конкретной реализации, реализация задается в наследниках
 * abstract говорит о том, что сущность является абстрактной
 * по-хорошему в абстрактном классе должны быть абстрактные методы, но их может и не быть, но в таком случае
 * абстрактный класс не имеет смысла
 *
 * абстрактый класс не может быть создан напрямую, т.е. нельзя создать объект/экземпляр абстрактного класса
 */
public abstract class Animal {
    private double weight;
    private String environment;
    private String nickname;

    public Animal(double weight , String environment , String nickname) {
        this.weight = weight;
        this.environment = environment;
        this.nickname = nickname;
    }

    public abstract void sayHello();

    public abstract void makeSound();
    public abstract void eat();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", environment='" + environment + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
