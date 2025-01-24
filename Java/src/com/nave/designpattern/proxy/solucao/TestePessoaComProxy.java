package com.nave.designpattern.Proxy.solucao;

import com.nave.designpattern.Proxy.PessoaService;
import com.nave.designpattern.Builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComProxy {

    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        // NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new
        // NovoPessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(pessoaRepositoryProxy);

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

        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);
    }
}
