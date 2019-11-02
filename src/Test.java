public class Test {

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        Animal[] animals = animalTest.createAnimalArray();

        System.out.println(animals[0]);
        System.out.println(animals[1]);
    }
}
