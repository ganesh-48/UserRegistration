package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);
    private String firstName;

    public String getFirstName(){
        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();
        return firstName;
    }

    /*@Description-*User enters a first name using regex
    *it prints the name is valid or invalid
     */
    public boolean registerFirstName(String firstName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(firstName);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("your first name is valid");
        }else{
            System.out.println("Your first name is invalid");
        }
        return matches;
    }

    public static void main(String[] args){
        UserRegistration userRegistration = new UserRegistration();
        String firstName = userRegistration.getFirstName();
        userRegistration.registerFirstName(firstName);

    }
}
