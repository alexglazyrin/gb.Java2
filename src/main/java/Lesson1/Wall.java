package Lesson1;

import java.awt.desktop.AppReopenedEvent;

public class Wall extends Obstacle {

    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected boolean move(Action action) {
        System.out.println("Стена. " + super.getName() + ". Высота: " + this.height);
        action.jump();

        if (getHeight() <= action.getJumpHeight()) {
            System.out.println("Перепрыгнул");
            return true;
        } else {
            System.out.println("Не перепрыгнул");
            return false;
        }

    }
}
