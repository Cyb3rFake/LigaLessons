package lesson_3.homework.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoeingTest {

    @Test
    void fly() {
        Boeing boeing = new Boeing();
        boeing.setModel("737");
        boeing.fly(boeing.getModel());
    }

    @Test
    void takeoff() {
    }

    @Test
    void landing() {
    }

    @Test
    void climb() {
    }

    @Test
    void decline() {
    }
}