package com.forca.model;

import com.forca.service.ListaPalavrasService;

public class Jogo {
    public class Border {
        private int ponto;
        private int error;
        private String tentar;
        private Jogador jogador;
        private ListaPalavras palavras;
    
        public int getPonto() {
            return ponto;
        }
    
        public void setPonto(int ponto) {
            this.ponto = ponto;
        }
    
        public int getError() {
            return error;
        }
    
        public void setError(int error) {
            this.error = error;
        }
    
        public String getTentar() {
            return tentar;
        }
    
        public void setTentar(String tentar) {
            this.tentar = tentar;
        }
    
        public Jogador getJogador() {
            return jogador;
        }
    
        public void setJogador(Jogador jogador) {
            this.jogador = jogador;
        }
    
        public ListaPalavras getPalavras() {
            return palavras;
        }
    
        public void setPalavras(ListaPalavras palavars) {
            this.palavras = palavars;
        }
    
    }

    public void setPalavras(ListaPalavrasService listaPalavrasService) {
    }

    public void setPonto(int i) {
    }

    public void setError(int i) {
    }
    
}
