package com.example.a1page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class apresentacao extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);
        carregaAdapter();

    }

    private void carregaAdapter() {
        ArrayAdapter<subsistemas> livroArrayAdapter;

        livroArrayAdapter = new ArrayAdapter<subsistemas>(
                this,
                android.R.layout.simple_list_item_1,
                subsistemas.subsistemas
        );
        AdapterView.OnItemClickListener itemClick;
        itemClick = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                Intent intent = new Intent(apresentacao.this, detalhes.class);
                intent.putExtra(detalhes.EXTRA_SUBSISTEMA, (int) id);
                startActivity(intent);
            }
        };
        ListView lvsubsistemas = findViewById(R.id.lvsubsistemas);
        lvsubsistemas.setAdapter(livroArrayAdapter);
        lvsubsistemas.setOnItemClickListener(itemClick);
    }
    }
