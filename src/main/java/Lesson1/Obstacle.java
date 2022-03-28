package Lesson1;

public abstract class Obstacle {
    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    protected abstract boolean move(Action action);

    public String getName() {
        return name;
    }
}
