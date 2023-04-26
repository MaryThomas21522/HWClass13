package HWClass13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Write to see if String is a palindrome:");
        String givenString = inp.nextLine().replace(" ","");

        StringBuilder reverseInput = new StringBuilder(givenString);
        reverseInput.reverse();
        String inputCheck = reverseInput.toString();

        boolean isPalindrome = inputCheck.equalsIgnoreCase(givenString);
        System.out.println(isPalindrome);
    }
}
/*
How would you check if String is palindrome or not? aba=> true Abbc =>false
 */
