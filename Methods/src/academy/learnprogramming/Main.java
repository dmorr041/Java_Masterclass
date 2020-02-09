package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 8000;
        int levelCompleted = 5;
        int bonus = 200;

        int finalScore1 = calculateScore(true, 800, levelCompleted, bonus);
        int finalScore2 = calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}

class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour * 0.621371);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0.0) {
            System.out.println("Invalid Value");
            return;
        }

        long mph = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
    }
}