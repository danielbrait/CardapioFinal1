package com.example.braitinho.cardapio;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Braitinho on 03/11/2017.
 */

public class ViewHolder {
    private ImageView foto;
    private TextView nome, detalhe;

    public ViewHolder(ImageView foto, TextView nome, TextView detalhe)
    {
        this.foto = foto;
        this.nome = nome;
        this.detalhe = detalhe;
    }

    public ImageView getFoto() {
        return foto;
    }

    public void setFoto(ImageView foto) {
        this.foto = foto;
    }

    public TextView getNome() {
        return nome;
    }

    public void setNome(TextView nome) {
        this.nome = nome;
    }

    public TextView getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(TextView detalhe) {
        this.detalhe = detalhe;
    }
}
