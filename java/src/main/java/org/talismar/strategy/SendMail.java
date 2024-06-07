package org.talismar.strategy;

/*
* Context
* */
public class SendMail {
    private SendMailStrategy sendMailStrategy;

    SendMail(SendMailStrategy sendMailStrategy) {
        this.sendMailStrategy = sendMailStrategy;
    }

    public void sendMail() {
        sendMailStrategy.send();
    }
}
