package _04_ConditionalsAndLoops._01_FindCharacterCase;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        scanner.close();

        if(ch >= 'A' && ch <= 'Z' ) {
            System.out.println("1");
        } else if (ch >= 'a' && ch <= 'z' ) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}
