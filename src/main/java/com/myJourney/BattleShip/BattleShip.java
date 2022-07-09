package com.myJourney.BattleShip;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args) {
        System.out.print("**** Welcome to Omer's Battle Shipe game **** \n \n     right now the sea is empty \n ");
        int[][] userArry = new int[10][10];
        int[][] computerarry = new int[10][10];

        deploy(userArry);

        delpoycoords(userArry);

        pcShip(computerarry);

        Battle(computerarry, userArry, 5, 5);

    }

    public static void deploy(int array[][]) {
        int[][] userDeploy = array;
        System.out.print("  ");
        for (int i = 0; i < userDeploy.length; i++) {
            System.out.print(i);
        }
        System.out.println("");
        for (int i = 0; i < userDeploy[0].length; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < userDeploy.length; j++) {
                if (userDeploy[i][j] == 0) {
                    System.out.print(" ");
                } else if (userDeploy[i][j] == 1) {
                    System.out.print("@");
                } else if (userDeploy[i][j] == 2) {
                    System.err.println("X");
                } else if (userDeploy[i][j] == 3) {
                    System.err.print("!");
                }

            }
            System.out.print("|" + i);
            System.out.println("");
        }
        System.out.print("   ");
        for (int t = 0; t < userDeploy.length; t++) {
            System.out.print(t);
        }
        System.out.println("");
    }

    public static void delpoycoords(int array[][]) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("now to gonna deploy your army of ship");

        for (int i = 1; i <= 5; i++) {
            System.err.print("choose X cordinat for your " + i + " ship");

            int x = scanner.nextInt();
            while (x < 0 || x > 9) {
                System.out.println("coordinate have to be between 0-9");
                x = scanner.nextInt();

            }

            System.err.println("choose Y cordinat");

            int y = scanner.nextInt();

            while (y < 0 || y > 9) {
                System.out.println("coordinate have to be between 0-9");

                x = scanner.nextInt();

            }

            if (array[x][y] == 1) {
                System.out.println("you have already places a ship at coordinate" + x + y);
                System.err.print("choose X cordinat for your " + i + " ship");
                x = scanner.nextInt();
                System.err.println("choose Y cordinat");
                y = scanner.nextInt();

            }
            array[x][y] = 1;
            deploy(array);

        }
        deploy(array);
    }

    public static void pcShip(int array[][]) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            if (array[x][y] == 1) {
                x = random.nextInt(10);
                y = random.nextInt(10);
                array[x][y] = 1;

            }
            System.err.println("pc Ship had deployed");
        }
    }

    public static void Battle(int pcarray[][], int usrarray[][], int usrshipive, int pcshiplive) {
        Scanner scanner = new Scanner(System.in);
        while (usrshipive > 0 || pcshiplive > 0) {

            System.out.print("!! Now its time for battle !! /n Loading ammunation...");
            System.err.println("");
            System.err.println("Choose cordinat 'X'");
            int x = scanner.nextInt();
            System.out.print("choose cordinat 'Y'");
            int y = scanner.nextInt();
            if (pcarray[x][y] == 1) {
                System.err.print("Booyaaa its a hit capten");
                pcarray[x][y] = 3;
                pcshiplive--;
            } else if (pcarray[x][y] != 1) {
                System.err.println( "missed capten, prepar for fire");
                pcarray[x][y] = 2;

            }
            Random random = new Random();
            int i = random.nextInt(10);
            int j = random.nextInt(10);
            if (usrarray[i][j] == 1) {
                System.err.print("Ship Down by the pc");
                usrarray[i][j] = 3;
            } else if (usrarray[i][j] == 0) {
                System.err.println("Pc missed");
            }
        }
    }
}
