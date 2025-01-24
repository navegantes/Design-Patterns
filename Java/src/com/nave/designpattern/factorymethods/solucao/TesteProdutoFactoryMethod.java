package com.nave.designpattern.Factorymethods.solucao;

import com.nave.designpattern.Factorymethods.Produto;
import com.nave.designpattern.Factorymethods.TipoProdutoEnum;

public class TesteProdutoFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
    }
}
