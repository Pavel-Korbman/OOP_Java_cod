

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Барсик");
//     //   animal.name = "Мурзик"; // Поле стало приватным
//        animal.setName("Мурзик");
//        animal.voice();
//        System.out.println(animal.getName());

        Cat cat_1 = new Cat();
        Dog dog_1 = new Dog();
        cat_1.setName("Тиля");
        dog_1.setName("Мухтар");
        cat_1.voice();
        dog_1.voice();
        cat_1.feed();
        cat_1.test();


    }
}