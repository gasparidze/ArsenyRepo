package org.example.animal;

public class Lion extends Animal{
    private String grivaColor;

    public Lion(double weight , String environment , String nickname , String grivaColor) {
        super(weight , environment , nickname);
        this.grivaColor = grivaColor;
    }

    /**
     * мы можем переопределять методы класса-родителя в потомках с новой реализацией (логикой),
     * но сигнатура метода должна остаться такой же
     *
     * @Override - аннотация Override, которая проверяет сигнатуру метода
     */
    @Override
    public void sayHello() {
        System.out.println("hello from lion");
    }

    @Override
    public void makeSound() {
        System.out.println("lion makes sound");
    }

    @Override
    public void eat() {
        System.out.println("lion is eating");
    }

    public String getGrivaColor() {
        return grivaColor;
    }

    public void setGrivaColor(String grivaColor) {
        this.grivaColor = grivaColor;
    }
}
