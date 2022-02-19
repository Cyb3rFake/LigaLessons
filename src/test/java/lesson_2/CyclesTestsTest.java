package lesson_2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CyclesTestsTest {

    @Test
    void main() {
    }

    @Test
    void whileTest() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    void doWhileTest() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    @Test
    void forTest() {
        // for работает со скобками
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("\n---------\n");

        // for так же работает без скобок с одной функцией
        for (int i = 0; i < 5; i++)
            System.out.println(i);
    }

    @Test
    void forEachTest() {
        String[] strs = new String[]{"one", "two", "three"};
        for (String text : strs) {
            System.out.println(text);
        }
    }

    @Test
    void breakTest() {
        for (int i = 0; i < 15; i++) {
            if (i == 3) break;
            System.out.println(i);
        }
    }

    /**
     * Более подробно про разницу "break" and "continue" http://developer.alexanderklimov.ru/android/java/break.php
     */
    @Test
    void continueTest() {
        for (int i = 0; i < 15; i++) {
            if ((i % 2) == 0) continue;
            System.out.println(i);
        }
    }

    @Test
    void preElementInForEachTest() {
        String[] strs = new String[]{"one", "two", "three"};
        for (String text : strs) {
            System.out.println(text);
            int beforeElementIndex = Arrays.asList(strs).indexOf(text) - 1;
            if (beforeElementIndex >= 0) {
                System.out.println("before element is: " + strs[beforeElementIndex]);
            }
        }
    }
}