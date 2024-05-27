package app;

import bank.Account;
import bank.Checkings;
import person.PersonProfile;

public class Controller {

    public static void main(String[] args) {
        PersonProfile one = new PersonProfile("Rafael", "Ojeda");
        PersonProfile two = new PersonProfile("El", "Chapulin");


        Account oneChecking = new Checkings(one, 0);
        Account twoChecking = new Checkings(two, 0);
        System.out.println(one);
    }
}
