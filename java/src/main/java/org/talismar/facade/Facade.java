package org.talismar.facade;

public class Facade {
    public void migrarClient(String nome, String cep) {
        CepApi cepApi = new CepApi();
        String cidade = cepApi.getCidadePorCep(cep);
        String estado = cepApi.getEstadoPorCep(cep);

        SubSystemCRM.gravarCliente(nome, cep, estado, cidade);
    }
}
