package com.nave.designpattern.Prototype.problema;

import com.nave.designpattern.Prototype.Botao;
import com.nave.designpattern.Prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {
    public BotaoAzul() {
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
