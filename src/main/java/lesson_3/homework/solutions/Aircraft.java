package lesson_3.homework.solutions;

public abstract class Aircraft {
    private String model;
    private String yearOfIssue;
    private String maximumNumberOfPassengers;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getMaximumNumberOfPassengers() {
        return maximumNumberOfPassengers;
    }

    public void setMaximumNumberOfPassengers(String maximumNumberOfPassengers) {
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }
}
