package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public boolean inform(User user) {
        System.out.println("The mail was send to " + user.getFirstName() + " " + user.getLastName() + ".");
        //...
        return true;
    }
}
