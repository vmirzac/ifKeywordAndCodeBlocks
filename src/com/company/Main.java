package com.company;

public class Main {

    public static void main(String[] args) {
	boolean gameover = true;
	int score = 6000;
	int levelCompleted = 5;
	int bonus = 100;

	if ((score <= 5000) && (score > 1000)){
        System.out.println("Your score was 5000 but greater than 1000");
    }
    else if (score < 1000) {
        System.out.println("Your Score was less than 1000");
    }
    else {
            System.out.println("got here");
        }
    }
}


