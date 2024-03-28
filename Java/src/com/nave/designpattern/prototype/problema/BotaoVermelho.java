package com.nave.designpattern.prototype.problema;

import com.nave.designpattern.prototype.Botao;
import com.nave.designpattern.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
