package com.example.braitinho.cardapio;

import java.io.Serializable;

/**
 * Created by Braitinho on 03/11/2017.
 */

public class Cardapio implements Serializable, Comparable<Cardapio> {
    private int id;
    private String nome, detalhe, valor;


    public Cardapio(int id, String nome, String descricao, String valor)
    {
        this.id = id;
        this.nome = nome;
        this.detalhe = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + detalhe + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }

    public int compareTo(Cardapio c)
    {
        return this.nome.compareTo(c.getNome());
    }

    public String getFoto()
    {
        String foto = nome.replace('A', 'a').replace("C", "c").replace("S", "s").replace("P", "p").replace("F", "f").replace("B", "b").replace("R", "r").replace("L", "l");
        return foto.replace('.', '_');
    }
}