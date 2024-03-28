package com.nave.designpattern.prototype.problema;

import com.nave.designpattern.prototype.Botao;
import com.nave.designpattern.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {
    public BotaoAzul() {
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
