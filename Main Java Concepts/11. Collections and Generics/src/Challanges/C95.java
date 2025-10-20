package Challanges;

import java.util.HashSet;
import java.util.Scanner;

class UniqueCharacters {
    public static void main(String[] args) {
        HashSet<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String userString = input.next();
//                Convert the string into array
        for(char ch: userString.toCharArray()){
            unique.add(ch);
        }

        System.out.printf("Your string has %d unique characters",unique.size());
    }
}
