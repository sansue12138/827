package test;

import java.util.Set;

/**
 * @author liuchang
 * @Create 2022-08-20-14:28
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("大黄");
        animal.setAge(12);
        animal.setLegs(4);
        System.out.println(animal.getName());
    }
}

class Animal{
    private String name;
    private int age;
    private int legs;
    //对属性的设置
    public void setName(String name){
       this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void setLegs(int legs){
        this.legs=legs;
    }
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println("name:"+name+" age:"+age+" legs:"+legs);
    }
}
