package com.nave.designpattern.Factorymethods.problema;

import com.nave.designpattern.Factorymethods.ProdutoDigital;
import com.nave.designpattern.Factorymethods.ProdutoFisico;

public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);

    }
}
