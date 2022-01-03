package Wildcards_2;

public class Animal2 {

    private int id;
    Animal2(int id) {
        this.id = id;
    }

    Animal2 (){
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public String toString() {
        return String.valueOf(id);
    }
}
