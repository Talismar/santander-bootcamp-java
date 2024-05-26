package org.talismar.strategy;

/*
* Context
* */
public class SendMail {
    private SendMailStrategy sendMailStrategy;

    public void sendMail() {
        sendMailStrategy.send();
    }
}
