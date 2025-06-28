package com.nave.designpattern.Builder.solucao;

import java.time.LocalDate;

import com.nave.designpattern.Builder.Pessoa;

public class TestePessoaBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Meu nome")
                .sobrenome("Meu sobrenome")
                .documento("95468264157")
                .email("meuemail@email.com")
                .apelido("Meu apelido")
                .dataNascimento(LocalDate.of(1987, 06, 03))
                .build();

        System.out.println(pessoa);

        StringBuilder sb = new StringBuilder().append("append1")
                .append("append2");

        System.out.println(sb);
    }
}
