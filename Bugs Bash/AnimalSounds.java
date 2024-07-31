
/* class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class SoundMaker {
    public void playSound(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Playing dog sound");
        } else {
            animal.makeSound();
        }
    }
} */


/* so the upper code violates the LSP and open-closed.
 * The SoundMaker class uses an instanceof check to handle the specific case of a Dog, 
 * which makes it difficult to extend the behavior for new animals without modifying the SoundMaker class.
 * 
 * 
 * 
 * 1. Ensure that each Animal subclass provides its own implementation of the makeSound method.
    2. Remove the instanceof check from the SoundMaker class and rely on the polymorphic behavior of makeSound.
 */


abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog barks.");
    }
}

class SoundMaker {
    public void playSound(Animal animal){
        animal.makeSound();
    }
}

