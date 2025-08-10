package org.example.animal;

public class Tiger extends Animal{
    private String uniqueParam;

    public Tiger(double weight , String environment , String nickname , String uniqueParam) {
        super(weight , environment , nickname);
        this.uniqueParam = uniqueParam;
    }

    @Override
    public void sayHello() {
        System.out.println("hello from tiger");
    }

    public String getUniqueParam() {
        return uniqueParam;
    }

    public void setUniqueParam(String uniqueParam) {
        this.uniqueParam = uniqueParam;
    }
}
