package lesson_3.homework.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование решения
 */
class ParrotTest {

    @Test
    void fly() {
        Parrot parrot = new Parrot();
        parrot.fly("Gosha");
        System.out.println();
        System.out.println(parrot.getAge());
    }
}