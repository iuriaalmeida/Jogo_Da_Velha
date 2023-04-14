package com.forca.service;

import java.util.ArrayList;
import java.util.List;

import com.forca.model.ListaPalavras;

public class ListaPalavrasService {
    
    public List<ListaPalavras> selectPalavra() {
        List<ListaPalavras> listaPalavras = new ArrayList<>();
        ListaPalavras palavra2 = new ListaPalavras("Agora" , "Nesse momento");
        listaPalavras.add(palavra2);
        ListaPalavras palavra3 = new ListaPalavras("Banana" , "Alimento de um animal");
        listaPalavras.add(palavra3);
        ListaPalavras palavra4 = new ListaPalavras("celular" , "Usamos para nos comunicar");
        listaPalavras.add(palavra4);
        ListaPalavras palavra5 = new ListaPalavras("diario" , "Há historias sobre o que já vivenciou");
        listaPalavras.add(palavra5);
        return listaPalavras;
        
    }

    public static List<ListaPalavrasService> selectWord() {
        return null;
    }     
}
