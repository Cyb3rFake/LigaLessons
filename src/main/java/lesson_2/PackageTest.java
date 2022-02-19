package lesson_2;

import java.util.Arrays;

public class PackageTest {
    public static void main(String[] args) {
        System.out.println("хаааай");

        System.out.println("args: " + args);
        System.out.println("Arrays.toString(args): " + Arrays.toString(args));
        for (String arg : args) {
            System.out.println("\"" + arg + "\"");
        }
    }
}
