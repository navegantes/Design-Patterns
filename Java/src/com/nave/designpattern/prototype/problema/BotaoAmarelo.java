package com.nave.designpattern.Prototype.problema;

import com.nave.designpattern.Prototype.Botao;
import com.nave.designpattern.Prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
