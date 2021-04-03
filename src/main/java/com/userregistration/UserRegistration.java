package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String password;

    public String getFirstName(){
        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();
        return firstName;
    }

    public String getLastName(){
        System.out.println("Enter your last name:");
        lastName = scanner.nextLine();
        return lastName;
    }

    public String getEmail(){
        System.out.println("Enter your email :");
        email = scanner.nextLine();
        return email;
    }

    public String getMobileNumber(){
        System.out.println("Enter your mobile number:");
        mobileNumber = scanner.nextLine();
        return mobileNumber;
    }

    public String getPassword(){
        System.out.println("Enter your password:");
        password = scanner.next();
        return password;
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
    /*@Description-*User enters a last name using regex
     *it prints the last name is valid or invalid
     */
    public boolean registerLastName(String lastName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(lastName);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("Your last name is valid");
        }else {
            System.out.println("Your last name is invalid");
        }
        return matches;
    }
    /*@Description-*User enters a email using regex
     *it prints the email is valid or invalid
     */
    public boolean registraterEmail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        boolean matches = matcher.find();
        if (matches) {
            System.out.println("Your email is valid");
        } else {
            System.out.println("Your email is invalid");
        }
        return matches;
    }

    /*@Description-*User enters a email using regex
     *it prints the mobile number is valid or invalid
     */
    public boolean registraterMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^((\\\\+)?(\\\\d{2}[-]))?(\\\\d{10}){1}?$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("Your mobile number is valid");
        } else{
            System.out.println("Your mobile number is invalid");
        }
        return matches;
    }

    /*@Description-*User enters a email  password using regex
     *it checks the password is valid or invalid
     *password contains  8 or more character
     *password should  havae at least one upper case character
     * password should havae at least one numeric number
     * password should have at least one special character
      */
    public boolean registraterPassword(String password) {
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\\\S+$).{8,}$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("Your Password is valid");
        } else{
            System.out.println("Your password was invalid");
        }
        return matches;
    }

    public static void main(String[] args){
        UserRegistration userRegistration = new UserRegistration();
        String firstName = userRegistration.getFirstName();
        userRegistration.registerFirstName(firstName);
        String lastName = userRegistration.getLastName();
        userRegistration.registerLastName(lastName);
        String email = userRegistration.getEmail();
        userRegistration.registraterEmail(email);
        String mobileNumber = userRegistration.getMobileNumber();
        userRegistration.registraterMobileNumber(mobileNumber);
        String password = userRegistration.getPassword();
        userRegistration.registraterPassword(password);
    }
}
