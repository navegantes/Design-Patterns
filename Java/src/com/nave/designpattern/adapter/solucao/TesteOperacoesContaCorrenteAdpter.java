package com.nave.designpattern.adapter.solucao;

import java.math.BigDecimal;

import com.nave.designpattern.adapter.problema.JarOperacoesContaCorrente;

public class TesteOperacoesContaCorrenteAdpter {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        client.saca(valorPretendidoParaSaque);

        client.deposita(new BigDecimal(500));
    }
}
