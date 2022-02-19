package lesson_3.homework.solutions;

public interface Flyable {
    String species = new String();
    int age = 10;

    /**
     * У птиц есть названия, у самолётов есть модели
     * @param name
     */
    public void fly(String name);
    public void takeoff(); // взлет
    public void landing(); // посадка/приземление
    public void climb(); // набор высоты
    public void decline(); // снижение
}
