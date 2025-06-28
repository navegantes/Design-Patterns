package com.nave.designpattern.Proxy.problema;

import com.nave.designpattern.Builder.Pessoa;
import com.nave.designpattern.Proxy.PessoaRepository;
import com.nave.designpattern.Proxy.PessoaService;

import java.time.LocalDate;

public class PessoaTest {

  public static void main(String[] args) {
    PessoaService pessoaService = new PessoaService(new PessoaRepository());

    Pessoa pessoa = new Pessoa.PessoaBuilder()
        .sobrenome("Sobre Nome")
        .dataNascimento(LocalDate.of(1985, 03, 12))
        .nome("Nome")
        .apelido("Ape lido")
        .documento("6548265781")
        .build();

    pessoaService.save(pessoa);

    Pessoa pessoaRetornada = pessoaService.findById(1L);
    System.out.println(pessoaRetornada);
  }
}
