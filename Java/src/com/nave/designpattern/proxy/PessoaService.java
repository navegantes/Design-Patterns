package com.nave.designpattern.proxy;

import com.nave.designpattern.builder.Pessoa;
import com.nave.designpattern.proxy.solucao.ProxyPessoa;

public class PessoaService {

    // private final PessoaRepositoryProxy pessoaRepositoryProxy;
    private final ProxyPessoa proxyPessoa;

    public PessoaService(ProxyPessoa proxyPessoa) {
        this.proxyPessoa = proxyPessoa;
    }

    public void save(Pessoa pessoa) {
        proxyPessoa.save(pessoa);
    }

    public Pessoa findById(Long id) {
        return proxyPessoa.findById(id);
    }
}
