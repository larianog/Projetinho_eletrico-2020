package com.example.a1page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detalhes extends AppCompatActivity {
    public static final String EXTRA_SUBSISTEMA= "numlivro";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        int numSubsistema = (Integer)getIntent().getExtras().get(EXTRA_SUBSISTEMA);
        subsistemas obra = subsistemas.subsistemas[numSubsistema];
        ImageView foto = findViewById(R.id.imgCapa);
        foto.setImageResource(obra.getImgResId());
        foto.setContentDescription(obra.getNome());
        TextView txtNome = findViewById(R.id.txtsubsistema);
        txtNome.setText(obra.getNome());
        TextView txtAutor = findViewById(R.id.txtChefe);
        txtAutor.setText(obra.getChefe());
        TextView txtciclo = findViewById(R.id.txtCiclo);
        txtciclo.setText(Integer.toString(obra.getCiclo()));
    }
}
