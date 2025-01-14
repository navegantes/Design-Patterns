package com.nave.designpattern.adapter.solucao;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrenteAdapter jarContaAdapter;

    public ClientJarOperacoesContaCorrenteAdapter(
            JarOperacoesContaCorrenteAdapter jarContaAdapter) {
        this.jarContaAdapter = jarContaAdapter;
    }

    public void saca(BigDecimal valorPretendido) {
        jarContaAdapter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor) {
        jarContaAdapter.deposita(valor);
    }
}
