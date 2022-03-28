package Lesson1;

public class TreadMil extends Obstacle {

    private int distance;

    public TreadMil(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    @Override
    protected boolean move(Action action) {
        System.out.println("Беговая дорожка. " + super.getName() + this.distance);
        action.run();

        if (getDistance() <= action.getRunDistance()) {
            System.out.println("Пробежал");
            return true;
        } else {
            System.out.println("Не пробежал");
            return false;
        }
    }
}
