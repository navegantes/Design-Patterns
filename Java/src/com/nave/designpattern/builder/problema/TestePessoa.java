package com.nave.designpattern.builder.problema;

import com.nave.designpattern.builder.Pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Meunome",
                "Meu Sobrenome",
                "9756429854",
                "meuemail@email.com",
                "Meu apelido",
                "03/06/1987"
        );

        System.out.println(pessoa);
    }
}
