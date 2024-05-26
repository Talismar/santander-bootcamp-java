package org.talismar.facade;

import java.util.Arrays;
import java.util.List;

public class SubSystemCRM {
    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        List<String> dados = Arrays.asList(nome, cep, estado, cidade);

        for (String dado : dados) {
            System.out.println(dado);
        }
    }
}
