

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Барсик");
     //   animal.name = "Мурзик"; // Поле стало приватным
        animal.setName("Мурзик");
        animal.voice();
        System.out.println(animal.getName());

    }
}