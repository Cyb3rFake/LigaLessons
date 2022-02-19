package lesson_3.homework.solutions;

/**
 * Боинг наследуется от самолётов где уже есть определение модели, количества пассажиров, запаса полёта,
 * в то время как любая птица имеет запас энергии для полёта, усталость
 */
public class Boeing extends Aircraft implements Flyable{
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
