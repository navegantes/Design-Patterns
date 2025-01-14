package com.nave.designpattern.proxy.solucao;

import com.nave.designpattern.builder.Pessoa;

public interface ProxyPessoa {
  void save(Pessoa pessoa);

  Pessoa findById(Long id);

}
