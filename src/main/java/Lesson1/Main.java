package Lesson1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Action[] actions = new Action[3];

        int distance = rand.nextInt(1000 - 1);
        int height = rand.nextInt(20 - 1);
        actions[0] = new People("Василий", 200, 2);

        distance = rand.nextInt(1000 - 1);
        height = rand.nextInt(20 - 1);
        actions[1] = new Robot("A7878", 800, 10);

        distance = rand.nextInt(1000 - 1);
        height = rand.nextInt(20 - 1);
        actions[2] = new Cat("Барсик", 100, 4);

        Obstacle[] obstacles = new Obstacle[5];

        boolean isTreadMil;
        for (int i = 0; i < obstacles.length; i++) {
            distance = rand.nextInt(100 - 1);
            isTreadMil = rand.nextBoolean();
            if (isTreadMil) {
                obstacles[i] = new TreadMil("Препятствие № " + (i + 1) + ", расстояние : ", distance);
            } else {
                obstacles[i] = new Wall("Препятстиве № " + (i + 1), height);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {
                result = obstacles[j].move(actions[i]);

                if (!result) {
                    break;
                    //System.out.println("break");
                }
            }
            if (result) {
                System.out.println("Полоса препятствий преодолена! Поздравляем!");
            } else {
                System.out.println("Полоса препятствий не преодолена. Попытка не засчитана.");
            }
        }

    }
}
