package Wildcards_1;

public class Animal1 {
    private int id;

    Animal1()   {

    }

    Animal1(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public String toString() {
        return String.valueOf(id);
    }

}
