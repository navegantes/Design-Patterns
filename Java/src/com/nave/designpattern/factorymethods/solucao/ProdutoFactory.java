package com.nave.designpattern.factorymethods.solucao;

import com.nave.designpattern.factorymethods.Produto;
import com.nave.designpattern.factorymethods.ProdutoFisico;
import com.nave.designpattern.factorymethods.ProdutoDigital;
import com.nave.designpattern.factorymethods.TipoProdutoEnum;

public class ProdutoFactory
{
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum)
    {
//        switch (tipoProdutoEnum)
//        {
//            case FISICO:
//                ProdutoFisico produtoFisico = new ProdutoFisico();
//                produtoFisico.setPossuiDimensoesFisicas(true);
//                return produtoFisico;
//
//            case DIGITAL:
//                ProdutoDigital produtoDigital = new ProdutoDigital();
//                produtoDigital.setPossuiDimensoesFisicas(false);
//                return produtoDigital;
//
//            default:
//                throw new IllegalArgumentException("Tipo de produto indisponível");
//        }
        if (tipoProdutoEnum == TipoProdutoEnum.FISICO){
            ProdutoFisico produtoFisico = new ProdutoFisico();
            produtoFisico.setPossuiDimensoesFisicas(true);
            return produtoFisico;
        } else if (tipoProdutoEnum == TipoProdutoEnum.DIGITAL) {
            ProdutoDigital produtoDigital = new ProdutoDigital();
            produtoDigital.setPossuiDimensoesFisicas(false);
            return produtoDigital;
        }
        else {
            throw new IllegalArgumentException("Tipo de produto indisponível");
        }
    }
}