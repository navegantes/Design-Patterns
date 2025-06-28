package com.nave.designpattern.Adapter.solucao;

import java.math.BigDecimal;

import com.nave.designpattern.Adapter.problema.JarOperacoesContaCorrente;

public class JarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrente jarConta;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }

    public void saca(BigDecimal valorPretendido) {
        if (jarConta.validaSaldo(valorPretendido)) {
            jarConta.saca(valorPretendido);
        } else {
            throw new IllegalArgumentException("Valor não permitido para saque.");
        }
    }

    public void deposita(BigDecimal valor) {
        jarConta.deposita(valor);
    }
}
