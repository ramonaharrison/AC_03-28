package nyc.c4q.ramonaharrison;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Kennel.java
 */
public class Kennel {

    static ArrayList<Dog> dogs = new ArrayList();

    public static void addDog(Dog dogToAdd) {
        dogs.add(dogToAdd);
    }

    public int numOfDogs() {
        return dogs.size();
    }

    public boolean hasDogs() {
        return !dogs.isEmpty();
    }

    public void shutdown() {
        dogs.clear();
    }

    public Dog removeDog(Dog dog) {
        dogs.remove(dog);
        return dog;
    }

    public void putDogsToSleep(int start, int end) {
        for (int i = start; i < end; i++) {
            dogs.remove(i);
        }

    }

    public Dog getDog(int index) {
        return dogs.get(index);
    }

    public Dog exchangeDog(int index, Dog dog) {
        Dog dogToGo = dogs.get(index);
        dogs.set(index, dog);
        return dogToGo;
    }

    public boolean isDogInKennel(Dog dog) {
        return dogs.contains(dog);
    }

    public int returnDogIndex(Dog dog) {
        return dogs.indexOf(dog);
    }

    public static Iterator<Dog> returnIterator() {
        Iterator<Dog> dogIterator = dogs.iterator();
        return dogIterator;
    }



    public static void main(String[] args) {

        Dog fido = new Dog("Fido", "Poodle", 1);
        Dog sport = new Dog("Sport", "GR", 12);
        Dog missy = new Dog("Missy", "Chihuahua", 20);
        Dog max = new Dog("Max", "German Shepherd", 2);
        Dog sleepy = new Dog("Sleepy", "Chow Chow", 25);
        Dog spot = new Dog("Spot", "Dalmation", 5);

        addDog(fido);
        addDog(sport);
        addDog(missy);
        addDog(max);
        addDog(sleepy);
        addDog(spot);

        Iterator<Dog> dogIterator = returnIterator();

        while (dogIterator.hasNext()) {
            Dog current = dogIterator.next();
            System.out.println(current.name);

        }

    }
}
