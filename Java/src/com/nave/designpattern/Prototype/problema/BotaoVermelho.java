package com.nave.designpattern.Prototype.problema;

import com.nave.designpattern.Prototype.Botao;
import com.nave.designpattern.Prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
