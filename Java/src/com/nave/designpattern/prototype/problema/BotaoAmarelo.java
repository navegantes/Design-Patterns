package com.nave.designpattern.prototype.problema;

import com.nave.designpattern.prototype.Botao;
import com.nave.designpattern.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
