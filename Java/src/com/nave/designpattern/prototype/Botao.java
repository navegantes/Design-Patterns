package com.nave.designpattern.prototype;

public class Botao {
    protected String cor;
    protected int largura;
    protected int altura;
    protected TipoBordaEnum tipoBorda;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setTipoBorda(TipoBordaEnum tipoBorda) {
        this.tipoBorda = tipoBorda;
    }

    public String getCor() {
        return cor;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public TipoBordaEnum getTipoBorda() {
        return tipoBorda;
    }

    @Override
    public String toString() {
        return "Botao{" +
                "cor='" + cor + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +
                ", tipoBorda=" + tipoBorda +
                '}';
    }
}
