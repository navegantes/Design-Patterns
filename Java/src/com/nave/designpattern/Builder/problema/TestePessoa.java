package com.nave.designpattern.Builder.problema;

import java.time.LocalDate;

import com.nave.designpattern.Builder.Pessoa;

public class TestePessoa {

  public static void main(String[] args) {

    Pessoa pessoa = new Pessoa(
        "Meunome",
        "Meu Sobrenome",
        "9756429854",
        "meuemail@email.com",
        "Meu apelido",
        LocalDate.of(1987, 06, 03));

    System.out.println(pessoa);

  }
}
