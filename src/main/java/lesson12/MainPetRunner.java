package lesson12;

public class MainPetRunner {

    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.voice();
        pet.move();
        Pet cat = new Cat();
        cat.voice();
        cat.move();
    }

}
