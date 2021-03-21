package com.test;
//import Scanner class to read user input
//This is iteration 1
import java.util.Scanner;
public class EnterPasswordTool {
    public static void main(String[] args) {
        //declare string variable password
        String password;
        //declare boolean variable isValid and initialize with true
        boolean isValid = true;
        //declare an integer variable i
        int i;
        //create an instance of Scanner class to read user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter password
        System.out.print("Enter password: ");
        //read password
        password = input.next();
        //if pass word length is less than 8,then set isValid to false
        if (password.length() < 8)
            isValid = false;
        //if isValid is true,then
        if (isValid) {
            //for loop iterate through the string password
            for (i = 0; i < password.length(); i++) {
                //if character at i th position is lower case letter or upper case letter,then break the loop
                if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') || (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'))
                    break;
            }
            //check if i and password length are equal,if so then loop exit normally(break not executed),then password is invalid(No letter)
            if (i == password.length())
                isValid = false;
        }
        //if isValid is true,then
        if (isValid) {
            //for loop iterate through the string password
            for (i = 0; i < password.length(); i++) {
                //if character at i th position is a number,then break the loop
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
                    break;
            }
            //check if i and password length are equal,if so then loop exit normally(break not executed),then password is invalid(No digit)
            if (i == password.length())
                isValid = false;
        }
        //if isValid is true,then pass word is accepted
        if(isValid)
            System.out.println("The password is accepted");
            //else pass word is not accepted
        else
            System.out.println("The password is not accepted");
    }
}