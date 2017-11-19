package com.example.braitinho.cardapio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListaCardapioActivity extends Activity {
    public static final String CARDAPIO = "com.example.braitinho.cardapio.cardapio";
    String busca;
    Cardapio[] cardapios;
    ListView listView;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cardapio);
        activity = this;
        Intent intent = getIntent();
        busca = intent.getStringExtra(MainActivity.CHAVE);
        cardapios = Data.buscaCardapio(busca);
        CardapioAdapter adapter = new CardapioAdapter(this, cardapios);
        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(activity, DetalheCardapioActivity.class);
                intent1.putExtra(CARDAPIO, cardapios[position]);
                startActivity(intent1);
            }
    });
    }
}
