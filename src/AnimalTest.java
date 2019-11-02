import java.util.Scanner;

public class AnimalTest {


    private Animal createAnimal() {
        Scanner input = new Scanner((System.in));
        System.out.println("Podaj typ zwierza ");
        String type = input.nextLine();
        System.out.println("Podaj imię zwierza ");
        String name = input.nextLine();
        System.out.println("Podaj wiek zwierza ");
        int age = input.nextInt();
        input.nextLine();
        return new Animal(type, name, age);
    }

    Animal[] createAnimalArray() {
        Animal[] animals = new Animal[2];
        animals[0] = createAnimal();
        animals[1] = createAnimal();
        if (animals[0].equals(animals[1])) {
            System.out.println(" Zwierze juz istnieje, podaj nowe zwierze");
            animals[1] = createAnimal();
        } else {
            System.out.println("Koniec");
        }
        return animals;
    }

}


//    Animal[] createAnimalArray() {
//        Animal[] animals = new Animal[3];
//        animals[0] = createAnimal();
//        animals[1] = createAnimal();
//        while (animals[0].equals(animals[1])) {
//            System.out.println(" Zwierze juz istnieje, podaj nowe zwierze");
//            animals[1] = createAnimal();
//        }
//        while (!animals[0].equals(animals[1])) {
//            animals[2] = createAnimal();
//        }
//        while (animals[2].equals(animals[1]) || animals[2].equals(animals[0])) {
//            System.out.println(" Zwierze juz istnieje, podaj nowe zwierze");
//            animals[2] = createAnimal();
//        }
//        return animals;
//    }
//}

