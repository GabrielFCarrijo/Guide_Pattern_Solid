package com.company.solid.interfaceSegregationPrinciple.exemploCorreto.implementacoes;

import com.company.solid.interfaceSegregationPrinciple.exemploCorreto.interfaces.Pagamento;
import com.company.solid.interfaceSegregationPrinciple.exemploCorreto.interfaces.PagamentoPorCartao;

public class PagamentoPorCartaoService implements Pagamento, PagamentoPorCartao {
    @Override
    public void processarPagamento() {
    }

    @Override
    public void validarTransacao() {
    }

    @Override
    public void obterDetalhesDoCartao() {
    }
}
