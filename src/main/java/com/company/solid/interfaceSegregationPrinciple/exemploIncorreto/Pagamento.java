package com.company.solid.interfaceSegregationPrinciple.exemploIncorreto;

//Refatore este código para seguir o ISP, criando interfaces mais específicas e classes
//de implementação para PagamentoPorCartao e PagamentoPorTransferenciaBancaria.

public interface Pagamento {
    void processarPagamento();
    void validarTransacao();
    void obterDetalhesDoCartao();
    void obterDetalhesDaTransferenciaBancaria();
}
