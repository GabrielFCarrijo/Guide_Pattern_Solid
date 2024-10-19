package com.company.solid.interfaceSegregationPrinciple.exemploCorreto.implementacoes;


import com.company.solid.interfaceSegregationPrinciple.exemploCorreto.interfaces.Pagamento;
import com.company.solid.interfaceSegregationPrinciple.exemploCorreto.interfaces.PagamentoPorTransferenciaBancaria;

public class PagamentoPorTransferenciaBancariaService implements Pagamento, PagamentoPorTransferenciaBancaria {

    @Override
    public void processarPagamento() {
    }
    @Override
    public void obterDetalhesDaTransferenciaBancaria() {

    }
}
