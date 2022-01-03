package Wildcards;

public class Animal {

    private int id;

    public Animal() {   //мы переопределили конструктор, поэтому должны явно обозначить дефолтный конструктор, так как у нас класс Dog наследуется от Animal

    }
    public Animal(int id) {
        this.id = id;   //В конструкторе присвоим тот id, который подставляется в качестве аргумента
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public String toString () { // переопределим метод toString() класса String
        return String.valueOf(id);  //подставляем целое число, которое конвертируется в объект класса String
    }
}
