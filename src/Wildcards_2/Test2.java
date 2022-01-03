package Wildcards_2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Animal2> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal2(1));
        listOfAnimal.add(new Animal2(2));

        List<Animal2> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog2());
        listOfDog.add(new Dog2());

        test(listOfAnimal);
        test(listOfDog);

    }
    private static void test(List<Animal2> list) {
        for(Animal2 animal : list) {
          //  System.out.println(animal);
            animal.eat();
        }
    }
}
