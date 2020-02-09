package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
	    Animal animal = new Animal(1, 1, 5, 5, "Animal");
	    Dog dog = new Dog(5, 70, "Kona", 2, 4, 1, 20, "Brindle");
	    dog.eat();
	    dog.run();
	    dog.walk();
    }
}
