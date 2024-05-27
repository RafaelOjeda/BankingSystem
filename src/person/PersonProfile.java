package person;

import bank.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class PersonProfile {
    private String firstName;
    private String lastName;
    private int socialSecurity;

    public static HashMap<Integer, PersonProfile> peopleProfiles = new HashMap<>();
    private ArrayList<Account> accounts = new ArrayList<>();

    /*
     *  This Random object is used for generating a Social Security
     *  and an ID for the PersonProfile.
     */
    Random rndGen = new Random();

    public PersonProfile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        socialSecurityGen();

        peopleProfiles.put(socialSecurity, this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

        peopleProfiles.put(socialSecurity, this);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void socialSecurityGen() {
        socialSecurity = rndGen.nextInt(0, 999999999);
    }

    public int getSocialSecurity() {
        return socialSecurity;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

//    public void displayInfo() {
//        System.out.println("-------------------------------------------");
//        System.out.println(firstName + " " + lastName + "'s \tProfile");
//        System.out.println("-------------------------------------------");
//        System.out.printf("Full Name: %s %s", firstName, lastName);
//        System.out.println();
//        System.out.println("Social Security: " + socialSecurity);
//    }
//
//    public void setBankAccounts(Boolean addRemove, BankAccount aBankAccount) {
//        if (addRemove) { // True means add a bank account to the ArrayList
//            if (bankAccounts.contains(aBankAccount)) {
//                System.out.println("Bank account already in wallet.");
//            } else {
//                bankAccounts.add(aBankAccount);
//            }
//        } else {
//            if (!bankAccounts.contains(aBankAccount)) {
//                System.out.println("Bank Account not in the wallet of " + firstName);
//            } else {
//                bankAccounts.remove(aBankAccount);
//            }
//        }
//    }

    public String toString() {
        return "[" + firstName + "," + lastName + "," + socialSecurity + "]";
    }
}
