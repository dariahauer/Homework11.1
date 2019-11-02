public class Test {

    public static void main(String[] args) {
        AnimalCreator animalCreator = new AnimalCreator();
        Animal[] animals = animalCreator.createAnimalArray();

        System.out.println(animals[0]);
        System.out.println(animals[1]);
    }
}
