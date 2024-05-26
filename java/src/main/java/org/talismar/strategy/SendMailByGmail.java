package org.talismar.strategy;

public class SendMailByGmail implements SendMailStrategy {

    @Override
    public void send() {
        System.out.println("Sending mail by gmail...");
    }
}
