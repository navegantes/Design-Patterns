package com.nave.designpattern.factorymethods.problema;

import com.nave.designpattern.factorymethods.ProdutoDigital;
import com.nave.designpattern.factorymethods.ProdutoFisico;

public class TesteProduto
{
    public static void main(String[] args)
    {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);


    }
}
