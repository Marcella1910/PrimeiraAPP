package gaurink.mar.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent();//obtem a intencao que criou a tela
        String textoDigitado = i.getStringExtra("texto");//pega o texto enviado pela primeira tela
        TextView tvTexto = findViewById(R.id.tvTexto);//obtem o campo que exibe o texto
        tvTexto.setText(textoDigitado);//seta o texto que o usuario digitou para ser exibido na tela
    }
}