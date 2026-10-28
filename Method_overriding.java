//Method Overriding - A child class provides its own implementation of a parent class method.

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
// Child class inherits from Animal
class Dog extends Animal{
    @Override 
    public void makeSound(){
        System.out.println("Dog Barks!");
    }
}
// Another child class
class Cat extends Animal{
     // Overrides the inherited method
    @Override 
    public void makeSound(){
        System.out.println("Cat meows");
    }
}

public class Method_overriding {
    public static void main(String args[]) {
         // Create a Dog object
        Dog dog = new Dog();
        dog.makeSound();
         // Create a Cat object
        Cat cat = new Cat();
        cat.makeSound();
    }
}

//@Override is called an annotation in Java; it tells the compiler that you intend to override a method inherited from the parent class.