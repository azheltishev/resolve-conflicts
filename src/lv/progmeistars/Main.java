package lv.progmeistars;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Math quiz");

        System.out.println("Choose difficulty : ");
        System.out.println("1) Low: 3 questions");
        System.out.println("2) Medium: 5 questions");
        System.out.println("3) Hard: 7 questions");

        int answer = scanner.nextInt();
        int questions = answer * 2 + 1;

        int score = 0;
        Random random = new Random();
        for (int i = 0; i < questions; i++) {
            int a = random.nextInt((int) Math.pow(10, answer));
            int b = random.nextInt((int) Math.pow(10, answer));
            int result = a + b;

            System.out.printf("%d + %d = ", a, b);
            int userResult = scanner.nextInt();

            if (userResult == result) {
                score++;
            }
        }

        System.out.printf("Score %d / %d%n", score, questions);
    }
}
