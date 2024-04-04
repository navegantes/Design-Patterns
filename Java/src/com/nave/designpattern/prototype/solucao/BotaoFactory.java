package com.nave.designpattern.prototype.solucao;

import com.nave.designpattern.prototype.Botao;

public class BotaoFactory {
    public static Botao getInstance(Botao prototipo) {

        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBorda(prototipo.getTipoBorda());

        return clone;
    }
}
