package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
//        if (button == 1) {
//            System.out.println("Hello");
//        } else if (button == 2) {
//            System.out.println("Namaste");
//        } else if (button == 3) {
//            System.out.println("Bonjour");
//        } else {
//            System.out.println("invalid button");
//        }
//        there can be more than 3 options and then we will have to keep writing if else
//        to make a bit cleaner code we can use switch

        switch (button) {
            case 1: System.out.println("Hello");
            break; /* break will break the condition otherwise it will run other cases as well even after finding a match*/
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("invalid button");
        }
    }
}