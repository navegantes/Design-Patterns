package com.nave.designpattern.Proxy;

import com.nave.designpattern.Proxy.solucao.ProxyPessoa;
import com.nave.designpattern.Builder.Pessoa;

public class PessoaService {

  // private final PessoaRepositoryProxy pessoaRepositoryProxy;
  private final ProxyPessoa proxyPessoa;

  public PessoaService(PessoaRepository proxyPessoa) {
    this.proxyPessoa = (ProxyPessoa) proxyPessoa;
  }

  public void save(Pessoa pessoa) {
    proxyPessoa.save(pessoa);
  }

  public Pessoa findById(Long id) {
    return proxyPessoa.findById(id);
  }
}
