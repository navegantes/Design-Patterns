package com.nave.designpattern.Proxy.solucao;

import com.nave.designpattern.Builder.Pessoa;

public interface ProxyPessoa {
  void save(Pessoa pessoa);

  Pessoa findById(Long id);

}
