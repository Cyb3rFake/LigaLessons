package lesson_3.homework.solutions;

/**
 * Попугай
 */
public class Parrot extends Bird implements Flyable{

    @Override
    public void fly(String name) {
        System.out.printf("%s летит", name);
    }

    @Override
    public void takeoff() {

    }

    @Override
    public void landing() {

    }

    @Override
    public void climb() {

    }

    @Override
    public void decline() {

    }
}
