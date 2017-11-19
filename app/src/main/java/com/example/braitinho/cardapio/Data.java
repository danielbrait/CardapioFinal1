package com.example.braitinho.cardapio;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    public static Cardapio[] _lista;

    public static Cardapio[] geraListaCardapio(){
        if(_lista == null) {
            Cardapio[] lista = new Cardapio[11];
            lista[0] = new Cardapio(1,"Salada Caesar","Alface, Molho Caesar e Croutons","R$23.90");
            lista[1] = new Cardapio(2,"Almodegas ao molho","Arroz, Feijão, Fritas e Salada","R$15.00");
            lista[2] = new Cardapio(3,"Costelinha de porco","Arroz, Feijão Tropeiro e Salada","R$15.50");
            lista[3] = new Cardapio(4,"Cupim","Arroz, Feijão e Farofa","R$17.00");
            lista[4] = new Cardapio(5,"Lasanha a Bolognesa","Brachola no molho e Salada","R$20.00");
            lista[5] = new Cardapio(6,"Filé de Peixe","Arroz, Feijão, Purê e Salada","R$16.00");
            lista[6] = new Cardapio(7,"Picadinho com Batatas","Arroz, Feijão, Fritas e Salada","R$14.00");
            lista[7] = new Cardapio(8,"File de Frango","Arroz, Feijão, Vinagrete e Salada","R$17.00");
            lista[8] = new Cardapio(9,"Frango Parmegiana","Arroz, Feijão e Batata Frita","R$23.00");
            lista[9] = new Cardapio(10,"Risoto de Camaraão","Camarão","R$25.00");
            lista[10] = new Cardapio(11,"Strogonoff de frango","Arroz, Feijão e Batata Palha","R$26.00");
            Arrays.sort(lista);
            _lista = lista;
        }
        return _lista;
    }

    public static Cardapio[] buscaCardapio(String chave){
        Cardapio[] lista = geraListaCardapio();
        if (chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<Cardapio> subLista = new ArrayList<>();
            for(Cardapio cardapio:lista){
                if(cardapio.getNome().toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(cardapio);
                }
            }
            return subLista.toArray(new Cardapio[0]);
        }
    }
}
