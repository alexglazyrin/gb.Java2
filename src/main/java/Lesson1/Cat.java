package Lesson1;

public class Cat implements Action{
    private String  name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;

    }

    @Override
    public void run() {
        System.out.println("Кот " + this.name + " бежит на " + this.getRunDistance() + " м");
    }

    @Override
    public void jump() {
        System.out.println("Кот " + this.name + " прыгает на " + this.getJumpHeight() + " м");
    }

    @Override
    public int getRunDistance(){
        return this.runDistance;
    }

    @Override
    public int getJumpHeight(){
        return this.jumpHeight;
    }
}
