package com.example.braitinho.cardapio;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalheCardapioActivity extends Activity {

    ImageView cardapioImageView;
    Cardapio cardapio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cardapio);
        Intent intent = getIntent();
        cardapio = (Cardapio) intent.getSerializableExtra(ListaCardapioActivity.CARDAPIO);
        cardapioImageView  = (ImageView) findViewById(R.id.cardapio_image_view);
        Drawable drawable = Util.getDrawable(this, cardapio.getFoto());
        cardapioImageView.setImageDrawable(drawable);

        TextView nome = (TextView) findViewById(R.id.txt_cardapio_nome);
        TextView descricao = (TextView) findViewById(R.id.txt_cardapio_descricao);
        TextView valor = (TextView) findViewById(R.id.txt_cardapio_valor);

        nome.setText(cardapio.getNome());
        descricao.setText(cardapio.getDetalhe());
        valor.setText(cardapio.getValor());
    }
}
