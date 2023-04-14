package com.forca.model;

public class ListaPalavras {
    private String palavra;
    private String dica;

    public ListaPalavras() {
    }

    public ListaPalavras(String palavra, String hint) {
        this.palavra = palavra;
        this.dica = dica;
    }

    public String getPalavras() {
        return palavra;
    }

    public void setPalavras(String palavra) {
        this.palavra = palavra;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
}
