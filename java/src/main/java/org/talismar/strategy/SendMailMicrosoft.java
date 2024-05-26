package org.talismar.strategy;

public class SendMailMicrosoft implements SendMailStrategy{
    @Override
    public void send() {
        System.out.println("Sending mail by microsoft...") ;
    }
}
