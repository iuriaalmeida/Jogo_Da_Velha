package com.forca.controller;

import java.util.List;

import com.forca.model.Jogador;
import com.forca.model.Jogo;
import com.forca.model.ListaPalavras;
import com.forca.service.ListaPalavrasService;

public class JogoController {
    Jogo jogo;

    public void comecaJogo(Jogador jogador) {
        jogo = new Jogo();

        ListaPalavrasService listaPalavrasService = new ListaPalavrasService();
        List<ListaPalavrasService> listListaPalavras = ListaPalavrasService.selectWord();
        int numAleatorio = (int) (Math.random() * listListaPalavras.size());
        jogo.setPalavras(listListaPalavras.get(numAleatorio));

        jogo.setPonto(0);
        jogo.setError(0);
    }

    public static boolean jogoAcabou() {
        return false;
    }

    public Object getEstadoJogo() {
        return null;
    }

    public void processaJogada(char charAt) {
    }

    public boolean jogadorGanhou() {
        return false;
    }
}
