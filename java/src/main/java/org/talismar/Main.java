package org.talismar;

import org.talismar.facade.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarClient("Talismar", "58915000");
    }
}